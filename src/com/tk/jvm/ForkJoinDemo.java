package com.tk.jvm;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;

public class ForkJoinDemo {
    public static void main(String[] args) throws Exception {
        long start = System.currentTimeMillis();
        MyTask myTask = new MyTask(0, 10000000);
        ForkJoinPool forkJoinPool = new ForkJoinPool();
        ForkJoinTask<Long> forkJoinTask = forkJoinPool.submit(myTask);
        System.out.println("计算结果：" + forkJoinTask.get());
        long sum = 0;
        for (int i = 0; i <= 10000000; i++) {
            if (i % 2 == 0 || i % 3 == 0 || i % 5 == 0 || i % 7 == 0)
                continue;
            sum += i;
        }
        System.out.println("计算结果：" + sum);
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }
}