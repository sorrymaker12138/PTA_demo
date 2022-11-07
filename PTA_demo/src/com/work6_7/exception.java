package com.work6_7;/*
 *
 * @Param
 */

import java.util.Scanner;

public class exception {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String choice = sc.next();
            try {
                if (choice.equals("number"))
                    throw new NumberFormatException();
                else if (choice.equals("illegal")) {
                    throw new IllegalArgumentException();
                } else if (choice.equals("except")) {
                    throw new Exception();
                } else
                    break;
            }catch (Exception e){
                if(e instanceof NumberFormatException){
                    System.out.println("number format exception");
                }else if(e instanceof  IllegalArgumentException){
                    System.out.println("illegal argument exception");
                }else{
                    System.out.println("other exception");
                }
                System.out.println(e);
            }

        }//end while
        sc.close();
    }

}
