package com.sheriyans.basics;

import java.util.Scanner;

public class RepeatHello {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean istrue = true;
        while(istrue){
            int n = sc.nextInt();
            if(n==1){
                System.out.println("hello");
            } else{
                System.out.println("No Execute");
                istrue = false;
                break;
            }
        }
    }
}
