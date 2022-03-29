package com.autowiring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;


public class Human {

    @Autowired
    private Heart heart;


    public Human() {
        System.out.println("Default constructor is called...");
    }

//    @Autowired
    public Human(Heart heart) {
        this.heart = heart;
        System.out.println("Constructor injection is called...");
    }

    public void setHeart(Heart heart) {
        this.heart = heart;
        System.out.println("Setter injection is called ....");
    }

    public void startPumping()
    {
        if(null!=heart)
        {
            heart.pump();
        }
        else
        {
            System.out.println("You are dead");
        }
    }
}
