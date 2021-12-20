package com.trios.shapes;

public class Sphere {
    private static final double PI = 3.14;
    public static double surface(double r){
        return 4*PI*r*r;
    }
    public static double volume(double r){
        return 4/3*PI*r*r*r;
    }
}
