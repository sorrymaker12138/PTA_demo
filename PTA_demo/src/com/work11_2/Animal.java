package com.work11_2;/*
 *
 * @Param
 */

public abstract class Animal {
    private String name;
    private int age;
    public abstract void info();
    public abstract void speak();

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
