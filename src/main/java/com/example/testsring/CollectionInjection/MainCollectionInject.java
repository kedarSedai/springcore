package com.example.testsring.CollectionInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainCollectionInject {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("collection.xml");
        Employee employee = (Employee) context.getBean("employee");
        System.out.println(employee);

    }
}
