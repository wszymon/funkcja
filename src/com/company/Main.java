package com.company;

public class Main
{

    public static void main(String[] args)
    {
        double a = 5;
        double b = -3;
        double c = -8;
        double d = b*b-4*a*c;
        double x1;
        double x2;
        double x0;
        if (d>0) {
            x1 = (-b - Math.sqrt(d)) / 2 * a;
            x2 = (-b + Math.sqrt(d)) / 2 * a;
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        }
        else if (d==0) {
            x0 = -b / 2 * a;
            System.out.println("x0 = " + x0);
        }
        else
            System.out.println("x nie istnieje");

    }
}