package com.tk.jvm;

import java.util.Random;
import java.util.concurrent.CyclicBarrier;

public class CyclicBarrierDemo {
    private static final int NUMBER = 7;

    public static void main(String[] args) {
        CyclicBarrier cyclicBarrier = new CyclicBarrier(NUMBER, () -> {
            System.out.println("*****集齐7颗龙珠，召唤神龙");
        });

        System.out.println("开始收集七龙珠");
        for (int i = 1; i <= 7; i++) {
            new Thread(() -> {
                try {
                    Random random = new Random();
                    try {
                        Thread.sleep(random.nextInt(10) * 1000);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + "星龙珠被收集 ");
                    //开启屏障，并陷入阻塞状态，直到最后一个线程到达屏障时，才会执行栅栏中的任务，然后屏障才会开门，之后才会执行后续代码
                    cyclicBarrier.await();
                    System.out.println(Thread.currentThread().getName() + "号选手使命结束");
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }, String.valueOf(i)).start();
        }
    }
}
