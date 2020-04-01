package com.lccui.dataprovider;

import com.lccui.testdata.TestData;
import org.testng.annotations.DataProvider;

public class GListDataProvider {
    //创建G单数据
    @DataProvider(name="createNormalList")
    public static Object[] [] createNormalList(){
        return new Object[][]{
                {TestData.g_name_normal},
        };
    }
}
