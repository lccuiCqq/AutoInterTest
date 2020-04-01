package com.demo.servlet;

import java.io.*;

public class FileTest {
    public static void main(String[] args) {
        try {
           // File file = new File("D:\\HelloWorld\\密码.txt");

            FileInputStream fileInputStream = new FileInputStream("D:\\HelloWorld\\密码.txt");
            int read = fileInputStream.read();
            while (read != -1){
                System.out.println((char) read);
                int read1 = fileInputStream.read();
                System.out.println(read1);
            }
            fileInputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
