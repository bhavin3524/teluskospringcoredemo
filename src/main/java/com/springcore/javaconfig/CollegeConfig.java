package com.springcore.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.springcore.javaconfig")
public class CollegeConfig {



    @Bean(name = "pricipalBean")
    public Pricipal getPricipalBean()
    {
        return new Pricipal();
    }

    @Bean(name="collegeBean")
    public College getCollegeBean()
    {
//        College college = new College();
//        return college;
        return new College(this.getPricipalBean(),"abhishek");
    }
}
