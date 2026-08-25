package com.sheriyans.basics;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int item, choice;
        int total = 0;
//        int n = sc.nextInt();
        do{
            System.out.println("\n====FOOD MENU====");
            System.out.println("1. Indian");
            System.out.println("2. Italian ");
            System.out.println("3. Chinese ");
            System.out.println("4. Russian");
            System.out.println("5. Exit");
            System.out.println("Select Category: ");
            choice = sc.nextInt();
            switch(choice){

                case 1 :
                    System.out.println("\n--- Indain Dishes---");
                    System.out.println("1. Paneer Butter Masala = 250");
                    System.out.println("2. Biryani = 200");
                    System.out.println("3. Dosa = 120");
                    System.out.println("Select Dish: ");
                    item = sc.nextInt();

                    switch(item){
                        case 1 :
                            total += 50;
                            System.out.println("Briyani Added");
                            break;
                    }

            }
        } while( choice != 5);
        System.out.println(total );
    }
}
