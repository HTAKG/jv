package com.tk.jvm;

public class Demo01 {
    public static void main(String[] args) {
        String str = "aa";
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(str.length() - 1 - i);
            int n = Character.digit(c, 16);
            sum += n * (1 << (4 * i));
        }
        System.out.println(str + "=" + sum);

        int i = Integer.parseInt(str, 16);

        //Demo02 demo02 = new Demo02();
    }

    int add() {
        return 1;
    }
}
