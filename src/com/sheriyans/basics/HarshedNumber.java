package com.sheriyans.basics;

import java.util.Scanner;

public class HarshedNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num = n;
        int sum = 0;
        while(n!=0){
            int ld = n % 10;
            sum += ld;
            n = n / 10;

        }

        if(num%sum==0) System.out.println("Harshed ");
        else System.out.println("Not");
    }
}
