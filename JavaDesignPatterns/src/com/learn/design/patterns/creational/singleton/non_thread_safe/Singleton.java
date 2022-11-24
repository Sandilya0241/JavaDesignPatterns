package com.learn.design.patterns.creational.singleton.non_thread_safe;

public class Singleton {
    private String value;
    private static Singleton singletonInstance = null;

    private Singleton(String value) {
        this.value = value;
    }

    public static Singleton getInstance(String val) {
        if(singletonInstance == null) {
            singletonInstance = new Singleton(val);
        }
        return singletonInstance;
    }

    public String getValue() {
        return value;
    }
}
