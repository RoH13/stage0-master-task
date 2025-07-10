package com.epam.conditions;

public class CoordinatePane {

    public void printQuadrant(int x, int y) {
        if (y == 0 || x == 0){
            System.out.println("zero");
        }else if (y > 0) {
            System.out.println(x > 0 ? "first" : "fourth");
        } else {
            System.out.println(x > 0 ? "second" : "third");
        }
    }
    

}

