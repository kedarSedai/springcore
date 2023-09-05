package com.example.testsring.ConstructorInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConstructorMain {
    public static void main(String[] args) {
        ApplicationContext context =  new ClassPathXmlApplicationContext("consInject.xml");
        Student student = (Student) context.getBean("student");
        System.out.println(student);

    }
}
