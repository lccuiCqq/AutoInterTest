package com.demo.servlet;

public class ArrayTest {
    public static void main(String[] args) {
        int [] array = {0,9,20,89};
        for (int a:array) {
            if(a == 9){
                break;
            }
            System.out.print(a);
            System.out.print(","+"\n");
        }
    }
}
