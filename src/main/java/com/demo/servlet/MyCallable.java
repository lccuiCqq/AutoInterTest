package com.demo.servlet;

import java.util.Date;
import java.util.concurrent.Callable;

public class MyCallable implements Callable<String> {
    @Override
    public String call() throws Exception {
        for (int i = 0; i < 10 ; i++) {
            System.out.println("Callable线程执行"+Thread.currentThread().getName()+new Date().getTime());

        }
        return "MyCallable执行完成";
    }
}
