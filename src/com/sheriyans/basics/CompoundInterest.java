package com.sheriyans.basics;

import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Principal : ");
        double principal = sc.nextDouble();
        System.out.println("Enter the Rate : ");
        double rate = sc.nextDouble();
        System.out.println("Enter the Time : ");
        double time = sc.nextDouble();

        double CI = principal * Math.pow(1 + rate / 100, time) - principal;

        System.out.println("The compound Interest is : " +CI);


    }
}
