package com.required_annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RequiredClient {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring_required.config.xml");
        System.out.println("File is loaded");
        Student student = context.getBean("requiredStudent", Student.class);
        System.out.println(student);
    }
}
