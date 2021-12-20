package com.trios.shapes;

public class Cube {
    public static double surface(double h){
        return 6*Math.pow(h,2);
    }
    public static double volume(double h){
        return Math.pow(h,3);
    }
}
