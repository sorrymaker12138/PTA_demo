package com.work11_2;/*
 *
 * @Param
 */

import java.util.Scanner;

public class Fan {
    public static final int SIOW = 1;
    public static final int MEDIUM = 2;
    private static  final int FAST = 3;
    private int speed = SIOW;
    private boolean on = false;
    private double radius = 5;
    private String color = "white";



    public Fan() {
    }

    public Fan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    @Override
    public String toString() {
        if(on){
            return "speed " + speed +"\ncolor " + color + "\nradius " + radius + "\nfan is on";
        }
        return "speed " + speed +"\ncolor " + color + "\nradius " + radius + "\nfan is off";
    }

    public static void main(String[] args) {
        System.out.println(" -------\n"
                +"Default\n"
                +"-----");
            Fan fan1=new Fan();
            System.out. println(fan1.toString());System.out.println(" -------\n"
                    + "My Fan\n"
                    +"-------");
            Scanner in=new Scanner(System.in);
            int fanSpeed=in.nextInt() ;
            boolean fanOn=in.nextBoolean();
            double fanRadius=in.nextDouble();String fanColor=in.next();
            Fan fan2=new Fan(fanSpeed, fanOn,fanRadius,fanColor);
            System.out.println(fan2.toString());

        }
}
