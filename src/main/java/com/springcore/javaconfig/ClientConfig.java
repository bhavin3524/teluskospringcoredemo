package com.springcore.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClientConfig {
	public static void main(String[] args) {

//		--------------------------------Using XML approach
		System.out.println("================Using xml configuration approach==============");

		ApplicationContext context1 = new ClassPathXmlApplicationContext("collegeconfig.xml");
		System.out.println("xml config file is loaded");
		College college1 = context1.getBean("collegeBean", College.class);
		System.out.println(college1.getCollegeName());

//		---------------------------------------------------Using annotation approach
		System.out.println("======================Using annotation approach================================");
		ApplicationContext context = new AnnotationConfigApplicationContext(CollegeConfig.class);
		
		System.out.println("file is loaded");
		
		College college = context.getBean("collegeBean",College.class);

		System.out.println(college.getCollegeName());

		
	}
}
