package com.test.testng.suite;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.LocalDate;

public class LoginTest {
//    @BeforeClass
//    public void BeforeClass(){
//        System.out.println("类执行前");
//    }
//
//    @AfterClass
//    public void AfterClass(){
//        System.out.println("类执行后");
//    }

    @Test(dataProvider = "user",dataProviderClass = LoginData.class)
    public void loginSuccess(String username,String password){
        //System.out.println("username"+username+"password"+password);
        //String result = username +password;
        //System.out.println(result);
        System.out.println(username);
        System.out.println(password);
        Assert.assertEquals(username, "abc");
        Assert.assertEquals(password,"lll");

    }
}
