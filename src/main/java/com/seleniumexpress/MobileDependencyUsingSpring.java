package com.seleniumexpress;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MobileDependencyUsingSpring {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring_demo.config.xml");
                    System.out.println("config loaded");

        Airtel airtel = context.getBean("airtelId", Airtel.class);
        airtel.calling();
        airtel.data();
        System.out.println("=========== this is bhavin");
        Vodafone vodafone = context.getBean("vodafoneId", Vodafone.class);
        vodafone.calling();
        vodafone.data();

//        ------------------
        Sim sim  = context.getBean("vodafoneId", Vodafone.class);
        sim.calling();
        sim.data();


    }
}
