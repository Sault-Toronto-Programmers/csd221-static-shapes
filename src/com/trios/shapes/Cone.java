package com.trios.shapes;

public class Cone {
    private static final double PI = 3.14;
    public static double surface(double r, double h){
        return PI*r*(r+Math.sqrt(r*r+h*h));
    }
    public static double volume(double r, double h){
        return  PI*r*r*h/3;
    }
}
