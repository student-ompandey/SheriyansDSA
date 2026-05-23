package com.sheriyans.basics;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n<=1) System.out.println("not prime");
        else if(n==2) System.out.println("prime");
        else if(n%2==0) System.out.println("not prime");
        else {
            boolean isPrime = true;
            for(int i=3;i<Math.sqrt(n);i+=2){
                if(n%i==0){
                    isPrime = false;
                    break;
                }
            }
            System.out.println(isPrime?"prime":"not prime");
        }


    }
}
