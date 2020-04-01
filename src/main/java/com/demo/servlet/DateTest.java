package com.demo.servlet;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest {
    public static void main(String[] args) {
        boolean date = new Date(2020,2,23).before(new Date(2020,2,24));
        System.out.println(date);
        Date date1 = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        System.out.println(simpleDateFormat.format(date1));

        try {
            long start = System.currentTimeMillis();
            System.out.println(new Date());
            Thread.sleep(3000);
            System.out.println(new Date());
            long end = System.currentTimeMillis();
            long diff = end - start;
            System.out.println(diff);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
