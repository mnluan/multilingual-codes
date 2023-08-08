package com.mnluan;

import java.text.DecimalFormat;
import java.util.Scanner;

public class TriangleType {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the sizes (cm) of the sides of the triangle (X, Y, and Z)");
        System.out.print("X: ");
        double x = scanner.nextDouble();
        System.out.print("Y: ");
        double y = scanner.nextDouble();
        System.out.print("Z: ");
        double z = scanner.nextDouble();

        if( x <= 0 || y <= 0 || z <= 0){
            System.out.println("The sizes of the sides should be positive.");
        }else{
            if(isTriangle(x,y,z)){
                System.out.println("It's a " + calcFormat(x,y,z) +" triangle! " + calcArea(x,y,z));
            }else{
                System.out.println("Nope, It's not a triangle!");
            }
        }

    }

    public static boolean isTriangle (double x, double y, double z){
        //check if it's a triangle
        //The sum of two sides must be greater than the third side
        return ((x + y > z) && (x + z > y) && (y + z > x));
    }

    public static String calcFormat(double x, double y, double z){
        if (x == y && y == z){
            return "Equilateral";
        }else if (x == y || x == z || y == z) {
            return "Isosceles";
        }else{
            double biggerSide = Math.max(Math.max(x,y), z);
            double sumSquaresMinorSides = (Math.pow(x, 2) + Math.pow(y, 2) + Math.pow(z, 2) - Math.pow(biggerSide, 2));
            if (sumSquaresMinorSides > Math.pow(biggerSide, 2)){
                return "Acute";
            } else if (sumSquaresMinorSides < Math.pow(biggerSide, 2)) {
                return "Obtuse";
            } else {
                return "Right";
            }
        }
    }

    public static String calcArea(double x, double y, double z){
        DecimalFormat df = new DecimalFormat();
        df.setMaximumFractionDigits(2);

        double p = ((x + y + z) / 2);
        double A = Math.sqrt(p*(p-x)*(p-y)*(p-z));

        return "And Its Area is " + df.format(A) +"cm";
    }
}