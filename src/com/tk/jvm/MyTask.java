package com.tk.jvm;

import java.util.concurrent.RecursiveTask;

public class MyTask extends RecursiveTask<Long> {
    private static final Integer ADJUST_VALUE = 10;
    private int begin;
    private int end;
    private long result;

    public MyTask() {
    }

    public MyTask(int begin, int end) {
        this.begin = begin;
        this.end = end;
    }

    @Override
    protected Long compute() {
        if ((end - begin) <= ADJUST_VALUE) {
            for (int i = begin; i <= end; i++) {
                if (i % 2 == 0 || i % 3 == 0 || i % 5 == 0 || i % 7 == 0)
                    continue;
                result += i;
            }
        } else {
            int middle = (end + begin) / 2;
            MyTask task1 = new MyTask(begin, middle);
            MyTask task2 = new MyTask(middle + 1, end);
            //重新调用compute()方法
            task1.fork();
            task2.fork();
            //合并结果
            result = task1.join() + task2.join();
        }
        return result;
    }
}

