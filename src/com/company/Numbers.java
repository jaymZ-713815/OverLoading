package com.company;

import java.util.Scanner;

public class Numbers {

    /**
     * Gets the sum of the two int parameters
     * @param num1
     * @param num2
     * @return
     */
    public static int sum2(int num1, int num2){
        return num1 + num2;
    }

    /**
     * gets the sum of three int parameters
     * @param num1
     * @param num2
     * @param num3
     * @return
     */
    public static int sum3(int num1, int num2, int num3){
        return num1 + num2 + num3;
    }

    /**
     * create two overloaded computeSum() methods
     * one computing the sum of two numbers
     * and one computing the sum of three numbers
     * @param num1
     * @param num2
     * @return
     */
    public static int computeSum(int num1, int num2){
        return num1 + num2;
    }
    public static int computeSum(int num1, int num2, int num3){
        return num1 + num2 + num3;
    }
    public static int greaterValue(int num1, int num2){
        return Math.max(num1, num2);
    }
    public static double greaterValue(double num1, double num2){
        return Math.max(num1, num2);
    }
}