package com.learn.design.patterns.creational.singleton.non_thread_safe;

public class DemoSingleton {
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance("Value1");
        Singleton singleton2 = Singleton.getInstance("Value2");
        System.out.println(singleton1.getValue());
        System.out.println(singleton2.getValue());
    }
}
