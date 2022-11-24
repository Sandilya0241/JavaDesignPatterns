package com.learn.design.patterns.creational.singleton.thread_safe;

public class Singleton {
    private String value;
    private static volatile Singleton singletonInstance;

    private Singleton(String value) {
        this.value = value;
    }

    public static Singleton getInstance(String val) {
        Singleton instance = singletonInstance;

        if(instance != null) {
            return instance;
        }
        synchronized(Singleton.class) {
            if (singletonInstance == null) {
                singletonInstance = new Singleton(val);
            }
            return singletonInstance;
        }
    }

    public String getValue() {
        return value;
    }
}
