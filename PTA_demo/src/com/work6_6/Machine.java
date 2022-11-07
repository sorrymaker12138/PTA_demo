package com.work6_6;/*
 *
 * @Param
 */

public class Machine {
    public void checkProduct(Product product)  throws DefectException{
        if (product.isDefect()) {
            DefectException defect=new DefectException();
            throw defect;
        }else {
            System.out.print(product.getName()+"不是次品! ");
        }
    }
}
