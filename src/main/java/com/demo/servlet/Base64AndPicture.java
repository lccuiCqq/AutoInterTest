package com.demo.servlet;

import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

import java.io.*;

public class Base64AndPicture {
    public String ImageToBase64(String imageFile){
        InputStream in = null;
        byte [] data = null;
        try {
            in = new FileInputStream(imageFile);
            data = new byte[in.available()];
            in.read(data);
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        BASE64Encoder encoder = new BASE64Encoder();
        if(data != null){
            return encoder.encode(data);
        }
        return null;
 
    }

    public boolean Base64ToImage(String base64, String imgFilePath) {
        // 对字节数组字符串进行Base64解码并生成图片
        if (base64 == null) // 图像数据为空
            return false;
        BASE64Decoder decoder = new BASE64Decoder();
        try {
            // Base64解码
            byte[] b = decoder.decodeBuffer(base64);
            for (int i = 0; i < b.length; ++i) {
                if (b[i] < 0) {// 调整异常数据
                    b[i] += 256;
                }
            }
            OutputStream out = new FileOutputStream(imgFilePath);
            out.write(b);
            out.flush();
            out.close();
            return true;
        } catch (Exception e) {
            return false;
        }

    }

    public static void main(String[] args) {
            /**String file = "C:\\Users\\lccui\\Desktop\\5.png";
            Base64AndPicture picture = new Base64AndPicture();
            String s = picture.ImageToBase64(file);
            System.out.println(s);

           */
            String file = "C:\\Users\\lccui\\Desktop\\123.txt";

            byte [] data = null;
            try {
                InputStream in = new FileInputStream(file);
                data = new byte[in.available()];
                in.read(data);
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            String s = new String(data);
            System.out.println(s);
            Base64AndPicture picture = new Base64AndPicture();


            String newPath = "C:\\Users\\lccui\\Desktop\\6.jpg";
            boolean b = picture.Base64ToImage(s,newPath);
            System.out.println(b);
    }

}
