package com.demo.servlet;

public class SonTest implements FatherTest{
    @Override
    public void eat() {
        System.out.println("son");
    }
    public void eat(String string){
        System.out.println("fruit");
    }
}
