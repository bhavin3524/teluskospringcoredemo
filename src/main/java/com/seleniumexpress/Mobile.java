package com.seleniumexpress;

public class Mobile {
    public static void main(String[] args) {
//        Airtel airtel = new Airtel();
//        airtel.calling();
//        airtel.data();

//        Vodafone vodafone = new Vodafone();
//        vodafone.calling();
//        vodafone.data();

        Sim sim = new Vodafone();
        sim.calling();
        sim.data();
        System.out.println("--------");
        Sim sim2 = new Airtel();
        sim2.calling();
        sim2.data();
    }
}
