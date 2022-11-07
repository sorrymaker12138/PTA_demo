package com.entity;/*
 *
 * @Param
 */

public class Computer implements ComputerWeight{
    private double weight;
    public Computer(double weight) {
        this.weight = weight;
    }

    @Override
    public double computeWeight() {
        return 2*weight;
    }
}
