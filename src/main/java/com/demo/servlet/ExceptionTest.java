package com.demo.servlet;

import java.io.IOException;

public class ExceptionTest {
    void eat() throws IOException {

    }
}
class MyException extends  ExceptionTest{
    @Override
    void eat() throws IOException {
        super.eat();
    }
}
