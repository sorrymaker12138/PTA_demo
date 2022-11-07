package com.work11_2;/*
 *
 * @Param
 */

public class Dog extends Animal{
    private int agility;

    public Dog(String name, int age, int agility) {
        super(name, age);
        this.agility = agility;
    }

    @Override
    public void info() {
        System.out.println("狗的名字是" + getName() +",年龄是" + getAge() + ",灵性值是" + agility);
    }

    @Override
    public void speak() {
        System.out.println("旺旺");
    }

    public int getAgility() {
        return agility;
    }

    public void setAgility(int agility) {
        this.agility = agility;
    }
}
