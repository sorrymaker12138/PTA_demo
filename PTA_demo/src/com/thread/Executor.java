package com.thread;/*
 *
 * @Param
 */

import java.time.LocalDateTime;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Executor {
    //创建线程池，分配十个线程
    private static final ExecutorService pool = Executors.newFixedThreadPool(10);

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        System.out.println("之前：" + LocalDateTime.now());

        /*String result = CompletableFuture.supplyAsync(() -> {
            System.out.println("开始计算：" + LocalDateTime.now());
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("结束计算：" + LocalDateTime.now());
            return "123";
        }, pool).get();//同步
        */

        CompletableFuture.supplyAsync(() -> {
            System.out.println("开始计算：" + LocalDateTime.now());
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("结束计算：" + LocalDateTime.now());
            return "123";//异步
        }, pool).thenAcceptAsync(result-> System.out.println("result"),pool);
        System.out.println("之后：" + LocalDateTime.now());
    }
}
