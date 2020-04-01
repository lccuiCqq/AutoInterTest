package com.demo.servlet;

import java.util.Date;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

public class ThreadDemo {
    public static void main(String[] args) {
      /**
        ThreadTestTwo thread = new ThreadTestTwo();
        thread.start();
        for (int i = 0; i < 10; i++) {
            System.out.println("main线程执行了");
        }
       */
      /**
      Thread thread = new Thread(new ThreadInterface());
      thread.start();
       */
//      //创建FutureTask实例，创建Callable实例
//        FutureTask<String> futureTask = new FutureTask<String>(new MyCallable());
//
//      //创建Thread执行FutureTask
//        Thread thread = new Thread(futureTask);
//        thread.start();
//
//        try {
//            String s = futureTask.get();
//            System.out.println(s);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        } catch (ExecutionException e) {
//            e.printStackTrace();
//        }

        //使用Executers获取线程池对象
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        executorService.execute(new ThreadInterface());
        for (int i = 0; i <10 ; i++) {
            System.out.println(Thread.currentThread().getName()+new Date().getTime());

        }

    }
}
