package com.demo.servlet;

public class Father {
    public void f(String name){
        System.out.println("father");
    }
}

 class Son extends Father{
    public void fs(String sex){
        System.out.println("son");
    }
}
