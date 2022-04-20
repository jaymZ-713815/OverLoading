package com.company;

import static com.company.Numbers.*;

/*
  Name: Marc James A. Gacho
  Student Number: 21-020217
  Section: BS-Information Technology 1-B
 */

/**
 * Using overloaded methods.
 *
 * @author MARC JAMES
 * @since 04/20/2022
 */

public class Main {

    public static void main(String[] args){

        /*
          calls the method that computes the sum of
          two int parameters
         */
        System.out.println(sum2(100, 200));

        /*
          calls the method that computes the sum of
          three int parameters
         */
        System.out.println(sum3(300, 400, 500));

        /*
          calls the methods that compute the one with two int parameters
          and one with three int parameters
         */
        System.out.println(computeSum(10, 20));
        System.out.println(computeSum(30, 40, 50));

        /*
          calls the greaterValue method with integer parameter
         */
        System.out.println(greaterValue(50, 100));

        /*
          calls the greaterValue method with double parameter
         */
        System.out.println(greaterValue(1.50, 2.00));
    }
}
