package com.entity;/*
 *
 * @Param
 */

public class Truck{
    private ComputerWeight[] computerWeights;

    public Truck(ComputerWeight[] computerWeights) {
        this.computerWeights = computerWeights;
    }
    public void setGoods(ComputerWeight[] computerWeights){
        this.computerWeights = computerWeights;
    }

    public void setComputerWeights(ComputerWeight[] computerWeights) {
        this.computerWeights = computerWeights;
    }

    public double getTotalWeights(){
        double sum = 0;
        for(ComputerWeight c:computerWeights){
            sum += c.computeWeight();
        }
        return sum;
    }
}
