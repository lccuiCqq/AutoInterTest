package com.test.testng;

import org.testng.annotations.*;

public class BasicAnnotation {
    //将方法标记为测试的一部分
    @Test
    public void testCase1(){
        System.out.println("方法一执行");
    }

    @Test
    public  void testCase2(){
        System.out.println("方法二执行");
    }

    @BeforeMethod
    public void BeforeMethod(){
        System.out.println("这是测试方法前执行");
    }

    @AfterMethod
    public void AfterMethod(){
        System.out.println("这是测试方法后执行");
    }

    @BeforeClass
    public void BeforeClass(){
        System.out.println("这是类运行前执行");
    }

    @AfterClass
    public void AfterClass(){
        System.out.println("这是类运行后执行");
    }

    @BeforeSuite
    public void BeforeSuit(){
        System.out.println("这是执行套件前执行");
    }

    @AfterSuite
    public void AfterSuit(){
        System.out.println("这是执行套件后执行");
    }

}
