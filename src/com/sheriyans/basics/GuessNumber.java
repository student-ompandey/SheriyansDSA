package com.sheriyans.basics;

import java.util.Scanner;


public class GuessNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Computer_random = (int)(Math.random()*100+1);
        int attempt = 4;
        while(true){
            if(attempt==0){
                System.out.println("You Lose the game");
                break;
            }
            System.out.println("Guess no. bwt 1 to 100\n" +
            "Attempt left " + attempt);

            int user = sc.nextInt();
            if(Computer_random==user){
                System.out.println("Congrats");
                break;
            }
            else if (user>Computer_random){
                System.out.println("Too High");
            }
            else {
                System.out.println("Too Low");
            }
            attempt--;
        }
    }
}
