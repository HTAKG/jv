package com.tk;

public class LazySingleton {
    private LazySingleton() {
    }

    private static class SingletonHolder {
        private static LazySingleton instance = new LazySingleton();
    }

    public static LazySingleton getInstance() {
        return SingletonHolder.instance;
    }
}
