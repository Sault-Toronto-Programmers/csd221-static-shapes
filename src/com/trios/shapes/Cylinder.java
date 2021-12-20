package com.trios.shapes;

public class Cylinder {
    private static final double PI = 3.14;
    public static double surface(double r, double h){
        return  (2*PI*r*h) + (2*PI*r*r);
    }
    public static double volume(double r, double h){
        return  PI*r*r*h;
    }
}
