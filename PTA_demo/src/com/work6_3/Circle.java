package com.work6_3;/*
 *
 * @Param
 */

/**
 * 圆形类
 */
public class Circle implements  IShape{
    private double r;

    public Circle(double r) {
        this.r = r;
    }

    @Override
    public double getArea() {
        return PI * r * r;
    }

    @Override
    public double getPerimeter() {
        return 2*PI*r;
    }
}
