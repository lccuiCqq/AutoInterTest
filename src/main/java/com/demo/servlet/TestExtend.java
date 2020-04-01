package com.demo.servlet;

public class TestExtend {
    public static void eatMilk(FatherTest fatherTest){
        fatherTest.eat();
    }
    public static void main(String[] args) {
        //TestExtend testExtend = new TestExtend();

        FatherTest fatherTest = new SonTest();
        FatherTest fatherTest1 = new SonsonTest();
        //fatherTest.eat();
        //SonTest sonTest = (SonTest)fatherTest;
        //sonTest.eat("s");
        eatMilk(fatherTest);
        eatMilk(fatherTest1);


    }

}
