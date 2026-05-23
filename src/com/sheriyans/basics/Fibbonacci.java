package com.sheriyans.basics;

import java.util.Scanner;

public class Fibbonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int f = 0, s = 1;
        System.out.print(f+" "+s+" ");

        for(int i=3;i<=n;i++){
            int th = f+s;
            f = s;
            s = th;
            System.out.print(th+" ");
        }
    }
}
