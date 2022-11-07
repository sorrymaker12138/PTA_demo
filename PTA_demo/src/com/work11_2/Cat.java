package com.work11_2;/*
 *
 * @Param
 */

public class Cat extends Animal{
    private int mousingAbility;

    public Cat(String name, int age, int mousingAbility) {
        super(name, age);
        this.mousingAbility = mousingAbility;
    }

    @Override
    public void info() {
        System.out.println("猫的名字是" + getName() +",年龄是" + getAge() + ",捕鼠能力是" + getMousingAbility());
    }

    @Override
    public void speak() {
        System.out.println("喵喵");
    }

    public int getMousingAbility() {
        return mousingAbility;
    }

    public void setMousingAbility(int mousingAbility) {
        this.mousingAbility = mousingAbility;
    }
}
