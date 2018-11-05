package com.test.core;

public class OutputService {

    private String name = "default";

    public void say() {
        System.out.println("hello " + name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
