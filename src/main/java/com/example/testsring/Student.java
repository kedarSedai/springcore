package com.example.testsring;

public class Student {
//
    public Student() {
        System.out.println("non- parameterized: ");
    }

    public Student(int id, String name) {
        System.out.println("injectiong from cons: ");
        this.id = id;
        this.name = name;
    }

    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        System.out.println("injectiong form seter: ");
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
