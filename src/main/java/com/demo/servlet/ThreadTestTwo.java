package com.demo.servlet;

import java.util.Date;

public class ThreadTestTwo extends Thread {
    @Override
    public void run() {
        for (int i = 0;i<10;i++){
            System.out.println("我的线程执行了"+new Date().getTime());
        }
    }


    }

