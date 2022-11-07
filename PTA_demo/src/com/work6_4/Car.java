package com.work6_4;/*
 *
 * @Param
 */

import java.util.Arrays;

class Car implements Cloneable{  //定义一个Car类 实现接口Cloneable


    //成员变量定义
    private String name;
    private CarDriver driver;
    private int[] scores;

    public Object clone(){  //重写clone方法
        Car c = null;
        try {
            c = (Car)super.clone(); //调用父类Object实现浅拷贝
            c.setDriver(this.driver.clone());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        //编写代码实现深拷贝
        return c;
    }
    //编写代码实现其他成员方法
    @Override
    public String toString() {
        return "Car [name=" + name + ", driver=" + driver + ", scores=" + Arrays.toString(scores) + "]";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CarDriver getDriver() {
        return driver;
    }

    public void setDriver(CarDriver driver) {
        this.driver = driver;
    }

    public int[] getScores() {
        return scores;
    }

    public void setScores(int[] scores) {
        this.scores = scores;
    }
}

