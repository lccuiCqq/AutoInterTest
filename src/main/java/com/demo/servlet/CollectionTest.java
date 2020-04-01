package com.demo.servlet;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionTest {
    public static void main(String[] args) {
        Collection collection = new ArrayList();
        boolean hello_world = collection.add("hello world");
        boolean empty = collection.isEmpty();
        Iterator iterator = collection.iterator();
        if (iterator.next()!=null){
            iterator.remove();
        }
        System.out.println(empty);
        System.out.println(iterator);
        System.out.println(hello_world);
        System.out.println(collection);
    }
}
