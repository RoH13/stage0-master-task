package com.epam.conditions;

public class IntegerDivider {

    public void printCompletelyDivided(int dividend, int divider) {
        int division = divider == 0? 0 : dividend / divider;
        if (divider == 0){
            System.out.println("division by zero");
        } else {
            System.out.println(division * divider == dividend ? "can be divided completely" : "cannot be divided completely");
        }
    }
    
}
