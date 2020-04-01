package com.test.testng.cases;

import com.test.testng.config.TestConfig;
import com.test.testng.model.InterfaceName;
import com.test.testng.model.LoginCase;
import com.test.testng.utils.ConfigFile;
import com.test.testng.utils.DataBaseUtil;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;
import org.apache.ibatis.session.SqlSession;
import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;


public class LoginTest {
    @BeforeTest(groups = "LoginTrue",description = "测试前获取httpclient对象")
    public void beforeTest(){
        TestConfig.loginUrl = ConfigFile.getUrl(InterfaceName.LOGIN);
        TestConfig.defaultHttpClient = new DefaultHttpClient();
    }
    @Test(groups = "LoginTrue",description = "用户登录接口测试")
    public void loginTrue() throws IOException {
        SqlSession sqlSession = DataBaseUtil.getSqlSession();
        LoginCase loginCase =sqlSession.selectOne("LoginCase",2);
        System.out.println(loginCase.toString());
        System.out.println(TestConfig.loginUrl);
        //发送请求
        String result = getResult(loginCase);
        System.out.println("result"+result);
        String excepted = loginCase.getExcepted();
        System.out.println("hh"+excepted);
        //验证结果
        Assert.assertEquals(loginCase.getExcepted(),result);
    }

    private String getResult(LoginCase loginCase) throws  IOException{
        HttpPost post =new HttpPost(TestConfig.loginUrl);
        //设置body
        JSONObject param = new JSONObject();
        param.put("userName",loginCase.getUserName());
        param.put("password",loginCase.getPassword());
        //设置消息头
        post.setHeader("content-type","application/json");
        StringEntity entity = new StringEntity(param.toString(),"utf-8");
        System.out.println("wo"+param);
        post.setEntity(entity);
        //测试执行
        String result;
        HttpResponse response  = TestConfig.defaultHttpClient.execute(post);
        result = EntityUtils.toString(response.getEntity(),"utf-8");

        //TestConfig.cookieStore = TestConfig.defaultHttpClient.getCookieStore();
        return result;

    }
}
