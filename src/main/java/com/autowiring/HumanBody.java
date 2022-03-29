package com.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HumanBody {
    public static void main(String[] args) {
       ApplicationContext autowiringContext = new ClassPathXmlApplicationContext("spring_autoworing_demmo.config.xml");

        Human human = autowiringContext.getBean("humanId", Human.class);
        human.startPumping();
    }
}
