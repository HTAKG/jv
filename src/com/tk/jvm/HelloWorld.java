package com.tk.jvm;

import java.util.Arrays;
import java.util.Random;

public class HelloWorld {
    public static void main(String[] args) {
        Random r = new Random();
        int[] arr = new int[50];  //多一个0
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(50) - r.nextInt(50);
        }
        System.out.println(Arrays.toString(arr));

        int min;
        for (int i = 0; i < arr.length; i++) {
            min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[min] > arr[j]) {
                    min = j;
                }
            }
            if (min != i) {
                int tmp;
                tmp = arr[i];
                arr[i] = arr[min];
                arr[min] = tmp;
            }
        }

        System.out.println("=====================================");
        System.out.println(Arrays.toString(arr));
    }


}
