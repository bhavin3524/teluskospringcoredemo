package com.dependencyinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exam {
    public static void main(String[] args) {
        ApplicationContext studentContext = new ClassPathXmlApplicationContext("spring_student.config.xml");
        Student student = studentContext.getBean("studentBeanId", Student.class);
//        System.out.println(student);


        Student student2 = studentContext.getBean("studentBeanId2", Student.class);
        System.out.println(student2.getStudentName());
        System.out.println(student2.getStudentId());
    }


}
