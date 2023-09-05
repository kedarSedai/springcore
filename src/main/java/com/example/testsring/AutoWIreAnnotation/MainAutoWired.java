package com.example.testsring.AutoWIreAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainAutoWired {
    public static void main(String[] args) {
//        1. // configL
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("autowireannotatiaon.xml");
//        Organization organization = (Organization) applicationContext.getBean("organization");
       Organization organization = (Organization) applicationContext.getBean("organization");
        System.out.println(organization);
    }
}
