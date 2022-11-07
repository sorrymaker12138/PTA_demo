package com.work6_4;/*
 *
 * @Param
 */

class CarDriver implements Cloneable{
    private String name;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public CarDriver() {}
    public String toString() {
        return "CarDriver [name=" + name+"]";
    }
    @Override
    protected CarDriver clone() throws CloneNotSupportedException {
        return (CarDriver) super.clone();
    }
}

