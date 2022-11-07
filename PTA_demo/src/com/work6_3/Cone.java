package com.work6_3;/*
 *
 * @Param
 */

/**
 * 锥体类
 */
public class Cone{
    private IShape IS;
    private double h;//高

    //计算锥体体积
    public double getVolume(){
        return IS.getArea()*h/3;
    }
    public Cone(IShape IS, double h) {
        this.IS = IS;
        this.h = h;
    }
}
