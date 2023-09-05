package com.example.testsring.ObjectiInject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ObjectMain {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("objectInject.xml");
        A a = (A) context.getBean("a");
        System.out.println(a);
    }
}
