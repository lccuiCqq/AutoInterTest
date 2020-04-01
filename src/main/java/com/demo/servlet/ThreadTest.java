package com.demo.servlet;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ThreadTest {
    public static ThreadLocal<SimpleDateFormat> sdfThreadLocal = new InheritableThreadLocal<SimpleDateFormat>(){
        @Override
        protected SimpleDateFormat initialValue() {
            return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        }
    };
    public static String format(Date date) throws ParseException {
        return sdfThreadLocal.get().format(date);
    }
    public static Date parse(String strDate) throws ParseException{
        return sdfThreadLocal.get().parse(strDate);
    }
}
