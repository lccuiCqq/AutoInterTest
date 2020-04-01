package com.demo.servlet;

import java.util.Locale;

public class CharacterTest {
    public static void main(String[] args) {
        char [] chars = {'a','b','d','E','c','q','P'};
        String s = new String(chars);
        String s1 = s.toUpperCase();
        String s2 = s.toLowerCase();

        System.out.println(s1);

        System.out.println(s2);

        StringBuffer stringBuffer = new StringBuffer("22+"+33);
        stringBuffer.append(11);
        System.out.println(stringBuffer);
        StringBuffer reverse = stringBuffer.reverse();
        System.out.println(reverse);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.reverse();

    }
}
