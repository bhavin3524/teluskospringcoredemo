package com.dependency_injection_objecttype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CloudCompany {
    public static void main(String[] args) {
        ApplicationContext empContext = new ClassPathXmlApplicationContext("spring_employee.config.xml");
        Employee emp = empContext.getBean("empBeanId", Employee.class);
        System.out.println(emp.getEmpId());
        System.out.println(emp.getEmpName());
        System.out.println(emp.getEmpAddress());

        System.out.println(empContext.getBean("empBeanId",Employee.class).getEmpName());
    }
}
