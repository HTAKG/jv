package com.tk.jvm;

import javafx.util.StringConverter;

public class JVMDemo {
    public static void main(String[] args) {
        ClassLoader classLoader1 = Object.class.getClassLoader();
        //null，Bootstrap启动类加载器，java中打印出来显示为null
        System.out.println(classLoader1);

        ClassLoader classLoader2 = JVMDemo.class.getClassLoader();
        //自己编的Class类，应用程序类加载器sun.misc.Launcher$AppClassLoader
        System.out.println(classLoader2);
        //父类sun.misc.Launcher$ExtClassLoader@1b6d3586
        System.out.println(classLoader2.getParent());
        //父父类null
        System.out.println(classLoader2.getParent().getParent());

        ClassLoader classLoader3 = StringConverter.class.getClassLoader();
        //javafx.util.StringConverter类，扩展类加载器sun.misc.Launcher$ExtClassLoader
        System.out.println(classLoader3);


    }
}
