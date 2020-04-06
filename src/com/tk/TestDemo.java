package com.tk;

import org.junit.Test;

public class TestDemo {

    @Test
    public void test01() {

    }

    public static void main(String[] args) {
        int n = 6;
        int count = 0;
        while (true) {
            n -= 3;
            n++;
            count++;
            if (n < 3) {
                System.out.println("共喝了" + (50 + count) + "瓶");
                break;
            }
        }
    }

}
