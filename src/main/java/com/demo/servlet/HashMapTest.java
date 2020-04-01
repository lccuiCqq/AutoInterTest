package com.demo.servlet;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest {


    public static void main(String[] args) {
        Map map = new HashMap();
          map.put("name", "lccui");
          map.put("sex","man");
        int size = map.size();
        String  name =(String)map.get("name");
        System.out.println(map);
        System.out.println(name+size);
        int i = 1<<4;
        int a = 3<<2;
        System.out.println(i);
        System.out.println(a);
    }


}
