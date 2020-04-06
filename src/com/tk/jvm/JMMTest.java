package com.tk.jvm;

import java.util.concurrent.TimeUnit;

public class JMMTest {
    public static void main(String[] args) throws InterruptedException {
        MyNumber myNumber = new MyNumber();

        new Thread(() -> {
            System.out.println(Thread.currentThread().getName()+"开始准备修改number");
            try {
                TimeUnit.SECONDS.sleep(3);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            myNumber.autoAdd();
            System.out.println(Thread.currentThread().getName()+"开始准备修改number完成");
        }, "AAA").start();

        //需要有一种通知机制，使用volatile修饰number
        while (myNumber.getNumber() == 10) {
            //里面不能写代码，否则无法看到主线程在这里死循环
        }

        System.out.println("主线程任务结束");
    }
}
