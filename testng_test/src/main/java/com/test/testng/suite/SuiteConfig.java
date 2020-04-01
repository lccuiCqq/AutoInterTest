package com.test.testng.suite;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.io.IOException;

public class SuiteConfig {
    @BeforeSuite
    public void BeforeSuite(){
        System.out.println("套件执行前");
    }
    @Test
    public void testPost() throws IOException {
        String result;
        HttpPost  post = new HttpPost("http://localhost:8081/v1/login");
        JSONObject param = new JSONObject();
        param.put("userName","root");
        param.put("password","123456");

        post.setHeader("content-type","application/json");
        StringEntity stringEntity = new StringEntity(param.toString());
        System.out.println(param);
        post.setEntity(stringEntity);
        DefaultHttpClient defaultHttpClient = new DefaultHttpClient();
        HttpResponse response = defaultHttpClient.execute(post);
        result = EntityUtils.toString(response.getEntity());
        System.out.println(result);
    }
    @AfterSuite
    public void AfterSuite(){
        System.out.println("套件执行后");
    }
}
