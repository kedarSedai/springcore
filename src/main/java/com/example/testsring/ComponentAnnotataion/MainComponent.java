package com.example.testsring.ComponentAnnotataion;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainComponent {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
        applicationContext.scan("com.example.testsring.ComponentAnnotataion");
        applicationContext.refresh();

        Employee employee = (Employee) applicationContext.getBean(Employee.class);
        employee.display();

    }
}
