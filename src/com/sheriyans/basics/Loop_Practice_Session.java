package com.sheriyans.basics;

import java.util.Scanner;

public class Loop_Practice_Session {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n = s.length();
        int even = 0, odd= 0;

        for(int i=0;i<n;i++){
            if(s.charAt(i)%2==0){
                even++;
            } else {
                odd++;
            }
        }
        System.out.println(even);
        System.out.println(odd);
    }
}
