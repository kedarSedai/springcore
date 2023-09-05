package com.example.testsring.AutoWire;

import com.example.testsring.ObjectiInject.A;
import com.example.testsring.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class OutputMain {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("autowire.xml");

        Address address = (Address) applicationContext.getBean("address" );
        System.out.println(address);
//        com.example.testsring.Student student = (Student) applicationContext.getBean("");
//        System.out.println(student);
    }
}
