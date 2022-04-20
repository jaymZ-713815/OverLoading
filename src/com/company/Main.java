package com.company;

import static com.company.Numbers.*;

public class Main {

    public static void main(String[] args) throws Exception{
        System.out.println(sum2(100, 200));
        System.out.println(sum3(300, 400, 500));

        System.out.println(computeSum(10, 20));
        System.out.println(computeSum(30, 40, 50));

        System.out.println(greaterValue(50, 100));
        System.out.println(greaterValue(1.50, 2.00));
    }
}
