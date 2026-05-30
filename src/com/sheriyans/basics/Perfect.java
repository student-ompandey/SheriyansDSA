package com.sheriyans.basics;

import java.util.Scanner;

public class Perfect {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        boolean isPerfect = false;
        for(int i=1;i*i<=n;i++){
            if(i*i==n){
                isPerfect = true;
            }
        }
        if(isPerfect) System.out.println("Perfect square");
        else System.out.println("not perfect square");
    }
}
