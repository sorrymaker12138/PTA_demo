package com.work11_2;/*
 *
 * @Param
 */

public class test {
    public static void main(String[] args) {
        String s1 = "string";
        StringBuffer s2 = new StringBuffer();
        s2.append("string");
        if(s1.equals(s2.toString())){
            System.out.println("二者相同");
        }
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
    }
}
