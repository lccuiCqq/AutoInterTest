package com.lccui.api;

import com.alibaba.fastjson.JSONObject;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class GList_API {
    /**
     * 创建G单
     */

    public static JSONObject CreateGList(String name){
        logger.info("后台正在创建订单"+name);
        HttpGet get =new HttpGet("www.baidu.com");
        HttpClient httpClient = new DefaultHttpClient();
        try {
            HttpResponse response = httpClient.execute(get);
        } catch (IOException e) {
            e.printStackTrace();
        }
        Common_API.login(httpClient);
        String path = ""+"/new";
        JSONObject parames = new JSONObject();
        parames.put("name"+name);
        JSONObject result = GList_API.getJSONObjectByPost(path,parames,"UTF-8");
        return result;
    }
    public static JSONObject getJSONObjectByPost(String path, HashMap<String,Object> paramsHashMap,String encoding){
        JSONObject resultJsonObject = null;
        List<NameValuePair> nameValuePairArrayList = new ArrayList<NameValuePair>();
        // 将传过来的参数填充到List<NameValuePair>中
        if (paramsHashMap != null && !paramsHashMap.isEmpty()) {
            for (Map.Entry<String, Object> entry : paramsHashMap.entrySet()) {
                nameValuePairArrayList.add(new BasicNameValuePair(entry.getKey(), entry.getValue()));
            }
        }

        UrlEncodedFormEntity entity = null;
        try {
            // 利用List<NameValuePair>生成Post请求的实体数据
            // 此处使用了UrlEncodedFormEntity!!!
            entity = new UrlEncodedFormEntity(nameValuePairArrayList, encoding);
            HttpPost httpPost = new HttpPost(path);
            // 为HttpPost设置实体数据
            httpPost.setEntity(entity);
            HttpClient httpClient = this.getHttpClient();
            // HttpClient发出Post请求
            HttpResponse httpResponse = httpClient.execute(httpPost);
            if (httpResponse.getStatusLine().getStatusCode() == 200) {
                // 得到httpResponse的实体数据
                HttpEntity httpEntity = httpResponse.getEntity();
                if (httpEntity != null) {
                    try {
                        BufferedReader bufferedReader = new BufferedReader(
                                new InputStreamReader(httpEntity.getContent(),"UTF-8"), 8 * 1024);
                        StringBuilder entityStringBuilder = new StringBuilder();
                        String line = null;
                        while ((line = bufferedReader.readLine()) != null) {
                            entityStringBuilder.append(line + "/n");
                        }
                        // 利用从HttpEntity中得到的String生成JsonObject
                        resultJsonObject = new JSONObject(entityStringBuilder.toString());
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return resultJsonObject;
    }

}
}
