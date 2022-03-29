package com.loosecoupling;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
    public static void main(String[] args) {
        ApplicationContext looseContext = new ClassPathXmlApplicationContext("spring_loose_coupling.config.xml");
        Student student;
        student = looseContext.getBean("looseCouplingStudent",Student.class);
        student.cheating();
    }
}
