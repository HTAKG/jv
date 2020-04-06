package com.tk.jvm;

import java.util.Arrays;

public abstract class Demo02 extends Demo01 {



    public static void main(String[] args) {
        String a= "1.1";
        String[] split = a.split("\\.");
        System.out.println(Arrays.toString(split));
    }


}
