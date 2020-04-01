package com.test.testng.suite;

import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class PayTest {
    //@BeforeGroups

    @Test(dataProvider = "user",dataProviderClass = LoginData.class)
    public void verifyLogin(String name,String password){
        System.out.println(name + password);
    }
}

