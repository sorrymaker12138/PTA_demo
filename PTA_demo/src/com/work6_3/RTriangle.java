package com.work6_3;/*
 *
 * @Param
 */

/**
 * 直角三角形
 */
public class RTriangle implements IShape{
    private double side1;
    private double side2;

    public RTriangle(double side1, double side2) {
        this.side1 = side1;
        this.side2 = side2;
    }

    @Override
    public double getArea() {
        return side1*side2/2;
    }

    @Override
    public double getPerimeter() {
        return side1 + side2 + Math.sqrt(Math.pow(side1,2) + Math.pow(side2,2));
    }
}
