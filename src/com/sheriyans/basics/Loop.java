package com.sheriyans.basics;

import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
//        for(int i=0;i<n;i++){
//            System.out.println("Om Pandey");
//        }
//        int sum = 0;
//        for (int i=1;i<=n;i++){
//            sum += i;
//        }
//        System.out.println(sum);

//        for(int i=1;i<=Math.sqrt(n);i++){
//            if(n%i==0){
//                System.out.print(i +" ");
//
//            }
//            if(i != n / i) {
//                System.out.print(i);
//            }
//            }
//        System.out.print(" "+n);

        int count = 0;
        for(int i=2;i<=n/2;i++){
            if(n%i==0){
                count = 1;
            }

        }
        if(count==0) System.out.println("prime");
        else System.out.println("not prime");




    }

    }

