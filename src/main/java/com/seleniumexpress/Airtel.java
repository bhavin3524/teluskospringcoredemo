package com.seleniumexpress;

public class Airtel implements  Sim{

    public Airtel() {
        System.out.println("airtel default constructor is called");
    }

    @Override
    public void calling() {
        System.out.println("calling using airtel sim...");
    }

    @Override
    public void data() {
        System.out.println("browsing using airtel sim...");
    }
}
