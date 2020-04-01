package com.test.testng.suite;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginData {
    @DataProvider(name = "user")
    public static Object[][] LoginData() {
        //System.out.println("hh");
        return new Object[][]{
                {"abc", "lll"},
                {"root", "password"}
        };
    }
}

