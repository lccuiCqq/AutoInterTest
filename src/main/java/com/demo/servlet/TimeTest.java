package com.demo.servlet;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class TimeTest {
    public static void main(String[] args) throws ParseException {
        String string = "01-29 13:00:22";
        SimpleDateFormat sdf = new SimpleDateFormat("MM-dd HH:mm:ss");
        System.out.println(sdf.format(sdf.parse(string)));
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(simpleDateFormat.format(sdf.parse(string)));
    }





}
