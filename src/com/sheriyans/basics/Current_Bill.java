package com.sheriyans.basics;

import java.util.Scanner;

public class Current_Bill {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int unit = sc.nextInt();

        int first100 = 100;
        int second100 = 100;
        int next200 = 200;

        if(unit > 0 && unit <= 100){

            System.out.println(unit * 4.2);

        } else if(unit <= 200){

            int above100 = unit - 100;

            System.out.println(first100 * 4.2 +
                    above100 * 6);

        } else if(unit <= 400){

            int above200 = unit - 200;

            System.out.println(first100 * 4.2 +
                    second100 * 6 +
                    above200 * 8);

        } else {

            int above400 = unit - 400;

            System.out.println(first100 * 4.2 +
                    second100 * 6 +
                    next200 * 8 +
                    above400 * 13);
        }
    }
}