package com.work6_6;/*
 *
 * @Param
 */

public class DefectException extends Exception{
    private String message;
   DefectException(){
       this.message = "次品!";
    }

    public void toShow(){
        System.out.print(message);
    }
}
