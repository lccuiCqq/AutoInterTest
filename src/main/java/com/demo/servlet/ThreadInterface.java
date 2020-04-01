package com.demo.servlet;

import java.util.Date;

public class ThreadInterface implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 10 ; i++) {
            System.out.println(Thread.currentThread().getName()+ new Date().getTime());

        }
    }
}
