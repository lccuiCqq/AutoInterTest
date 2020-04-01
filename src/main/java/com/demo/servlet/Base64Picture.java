package com.demo.servlet;

import sun.misc.BASE64Decoder;

import java.io.*;

public class Base64Picture {
    public static void main(String[] args) {
        String string;
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("C:\\Users\\lccui\\Desktop\\3.txt"));
            while((string = bufferedReader.readLine()) !=null){
                break;
            }
        } catch (IOException e) {
            e.printStackTrace();
            string = "";
        }
        System.out.println(string);
        BASE64Decoder base64Decoder =  new BASE64Decoder();
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File("C:\\Users\\lccui\\Desktop\\3.png"));
            byte[] bytes = base64Decoder.decodeBuffer(string);
            fileOutputStream.write(bytes);
            fileOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
