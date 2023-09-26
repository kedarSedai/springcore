package com.example.testsring.ComponentAnnotataion;


import org.springframework.stereotype.Component;

import java.io.Serializable;

@Component
public class Employee implements Serializable {
    private int id;
//    private String emp_name;

    Employee(){
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void display(){
        System.out.println("this is from Student Component: ");

    }
}
