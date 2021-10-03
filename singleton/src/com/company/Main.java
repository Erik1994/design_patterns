package com.company;

public class Main {

    public static void main(String[] args) {
        new Thread(() -> {
            Singleton singleton = Singleton.getInstance();
            System.out.println(singleton);
        }).start();

        new Thread(() -> {
            Singleton singleton = Singleton.getInstance();
            System.out.println(singleton);
        }).start();

        Singleton singleton = Singleton.getInstance();
        System.out.println(singleton);
    }
}
