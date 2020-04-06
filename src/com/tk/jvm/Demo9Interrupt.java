package com.tk.jvm;

public class Demo9Interrupt {
    public static boolean exit = true;

    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(new Runnable() {
            public void run() {
                while (exit) {

                    System.out.println("线程执行！");
//判断线程的中断标志来退出循环
                    if (Thread.currentThread().isInterrupted()) {
                        break;
                    }
                }
            }
        });
        t.start();
        Thread.sleep(1000l);
//中断线程
        t.interrupt();
        System.out.println(t.isInterrupted());
        System.out.println("线程中断了");
    }
}