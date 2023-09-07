package com.example.testsring.ObjectiInject;

import java.io.Serializable;

public class A implements Serializable {

    private int a;
    private int b;
    B obj;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public B getObj() {
        return obj;
    }

    public void setObj(B obj) {
        this.obj = obj;
    }

    @Override
    public String toString() {
        return "A{" +
                "a=" + a +
                ", b=" + b +
                ", obj=" + obj +
                '}';
    }
}
