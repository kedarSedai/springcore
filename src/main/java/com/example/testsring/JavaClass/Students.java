package com.example.testsring.JavaClass;

import org.springframework.beans.factory.annotation.Value;

import java.io.Serializable;

public class Students implements Serializable {
    public Students() {
    }

    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void display(){
        System.out.println("ID is : " + id);
        System.out.println("name is : " + name);
    }
}
