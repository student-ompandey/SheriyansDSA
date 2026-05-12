package com.sheriyans.basics;

import java.util.Scanner;

public class printFnx {
    public static void main(String[] args) {
//        System.out.println("om pandey");

//        int age = 10;
//        if(age > 18) System.out.println("You can vote");
//        else System.out.println("You cannot vote");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number : ");
        int a = sc.nextInt();
        System.out.println("Enter the secound number : ");
        int b = sc.nextInt();
        int sum = a + b ;
        System.out.println("Sum of a and b = " + sum);

    }
}
