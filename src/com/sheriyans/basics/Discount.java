package com.sheriyans.basics;
import java.util.*;

public class Discount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int amount = sc.nextInt();

        if(amount<=5000){
            System.out.println(amount);
        } else if(amount>=5000 && amount<=7000){
            System.out.println(amount - (amount * 5/100));
        } else if(amount>=7001 && amount<=9000) {
            System.out.println(amount - (amount * 10/100));
        } else if (amount >=9000){
            System.out.println(amount - (amount * 20/100));
        }
    }
}
