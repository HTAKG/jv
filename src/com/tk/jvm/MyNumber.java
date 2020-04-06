package com.tk.jvm;

public class MyNumber {
    private volatile int number = 10;

    public void autoAdd() {
        number = 20;
    }

    public int getNumber() {
        return number;
    }
}
