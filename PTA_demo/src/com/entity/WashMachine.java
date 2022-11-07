package com.entity;/*
 *
 * @Param
 */

public class WashMachine implements ComputerWeight{
    private double weight;
    public WashMachine(double weight) {
        this.weight = weight;
    }
    @Override
    public double computeWeight() {
        return 3*weight;
    }
}
