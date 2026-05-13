package com.sheriyans.basics;

import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Length of side 1  : ");
        double a = sc.nextDouble();
        System.out.println("Enter the Length of side 2 : ");
        double b = sc.nextDouble();
        System.out.println("Enter the Length of side 3 : ");
        double c = sc.nextDouble();

        double semi_perameter =  (a+b+c)/2;

        double Area = Math.sqrt(semi_perameter*(semi_perameter-a)*(semi_perameter-b)*(semi_perameter-c));

        System.out.printf("Area of the Triangle is : %.3f sq units", Area);
    }
}
