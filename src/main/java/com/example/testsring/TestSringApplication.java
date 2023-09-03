package com.example.testsring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class TestSringApplication {

    public static void main(String[] args) {
//        SpringApplication.run(TestSringApplication.class, args);

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("setterInject.xml");
        Student student = (Student) applicationContext.getBean("student");
        System.out.println(student);

    }

}
