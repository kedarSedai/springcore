package com.example.testsring.JavaClass;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentsMain {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("valueannotation.xml");
        Students students = (Students) context.getBean("students");
        students.display();
    }
}
