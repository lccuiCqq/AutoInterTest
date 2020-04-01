package com.lccui.suite.glist;

import com.alibaba.fastjson.JSONObject;
import com.lccui.api.GList_API;
import com.lccui.dataprovider.GListDataProvider;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GListCURD {
    /**
     * 创建正常名字的G单
     */
    @Test(dataProvider = "createNormalList",dataProviderClass = GListDataProvider.class,groups = {"p0","GList"},priority = 0)
    public void createNormalList(String createNormalList){
        JSONObject response = null;
        String msg = "";
        String code = "";
        String name = "";
        response = GList_API.CreateGList(createNormalList);
        msg = response.getString("msg");
        code = response.getString("code");
        result = response.getJSONObject("result");
        Assert.assertEquals(msg.equalsIgnoreCase("successd"),true,"Create G list FAIL:msg error");

    }
}
