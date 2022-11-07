package com.entity;/*
 *
 * @Param
 */

public class Television implements ComputerWeight{
    private double weight;

    public Television(double weight) {
        this.weight = weight;
    }

    @Override
    public double computeWeight() {
        return weight;
    }

}
