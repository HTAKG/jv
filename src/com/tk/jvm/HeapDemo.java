package com.tk.jvm;

public class HeapDemo {
    public static void main(String[] args) {
        int count = 0;

        long start = System.currentTimeMillis();
        labelZDY:
        //自定义标签，指定要跳出的循环体
        for (int i = 2; i <= 100000; i++) {
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    continue labelZDY; //跳出循环体
                }
            }
            count++;
        }
        long end = System.currentTimeMillis();

        System.out.println("质数个数：" + count + "，总耗时：" + (end - start));


    }
}
