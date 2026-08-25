package com.sheriyans.basics;

import java.util.Scanner;

public class ArmstrongNumber {

    public static int countDigitsMath(int number) {
        if (number == 0) return 1;
        return (int) Math.log10(Math.abs(number)) + 1;
    }
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int count = 0;
//        int num = n;
//        int f = n;
//        while(n!=0){
//            int ld = n % 10;
//            count++;
//            n = n / 10;
//        }
//        int ans = 0;
//
//        while(num!=0){
//            int ld = num %10;
//            int q = (int) Math.pow(ld, count);
//            ans += q;
//            num = num / 10;
//        }
//
//        if(ans == f) System.out.println("armstrong");
//        else System.out.println("not");

        System.out.println(countDigitsMath(234));


        }

    }

