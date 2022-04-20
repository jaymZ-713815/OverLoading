package com.company;

public class Numbers {

    /**
     * gets the sum of the two int parameters
     */
    public static int sum2(int num1, int num2){
        return num1 + num2;
    }

    /**
     * gets the sum of three int parameters
     */
    public static int sum3(int num1, int num2, int num3){
        return num1 + num2 + num3;
    }

    /**
     * create two overloaded computeSum() methods
     * one computing the sum of two numbers
     * and one computing the sum of three numbers
     */
    public static int computeSum(int num1, int num2){
        return num1 + num2;
    }
    public static int computeSum(int num1, int num2, int num3){
        return num1 + num2 + num3;
    }

    /**
     * method that modifies the greater number
     * between two integer values
     */
    public static int greaterValue(int num1, int num2){
        return Math.max(num1, num2);
    }

    /**
     * method that modifies the greatest number
     * between two double values
     */
    public static double greaterValue(double num1, double num2){
        return Math.max(num1, num2);
    }
}