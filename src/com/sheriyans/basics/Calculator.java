package com.sheriyans.basics;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice,item;
        int total = 0;
        do {
            System.out.println("\n====FOOD MENU====");
            System.out.println("1. Indian");
            System.out.println("2. Italian ");
            System.out.println("3. Chinese ");
            System.out.println("4. Russian");
            System.out.println("5. Exit");
            System.out.println("Select Category: ");
            choice = sc.nextInt();
            switch (choice){

                case 1:
                    System.out.println("\n--- Indain Dishes---");
                    System.out.println("1. Paneer Butter Masala = 250");
                    System.out.println("2. Biryani = 200");
                    System.out.println("3. Dosa = 120");
                    System.out.println("Select Dish: ");
                    item = sc.nextInt();

                    switch(item) {
                        case 1:
                            total +=250;
                            System.out.println("Paneer Butter Masala Added!");
                            break;
                        case 2:
                            total +=200;
                            System.out.println("Biryani Added! ");
                            break;
                        case 3:
                            total +=120;
                            System.out.println("Dosa Added! ");
                            break;
                        default:
                            System.out.println("Invalid Dish! ");

                    }
                    break;
                case 2:
                    System.out.println("\n---Italian Dishes---");
                    System.out.println("1. Pizza = 300");
                    System.out.println("2. Pasta = 220");
                    System.out.println("3. Burgger = 150");
                    System.out.println("Select Dish: ");
                    item = sc.nextInt();

                    switch(item) {
                        case 1:
                            total += 300;
                            System.out.println("Pizza Added!");
                            break;
                        case 2:
                            total += 220;
                            System.out.println("Pasta Added!");
                            break;
                        case 3:
                            total += 150;
                            System.out.println("Burger Added!");
                            break;
                        default:

                            System.out.println("Invaid Dish! ");

                    }
                    break;
                case 3:
                    System.out.println("\n---Chinese Dishes---");
                    System.out.println("1. Noodles = 180");
                    System.out.println("2. Fried Rice = 170");
                    System.out.println("3. Manchurian = 190 ");
                    System.out.println("Select Dish : ");
                    item = sc.nextInt();

                    switch(item) {
                        case 1:
                            total +=180;
                            System.out.println("Noodles Added! ");
                            break;
                        case 2:
                            total +=170;
                            System.out.println("Fried Rice Added! ");
                            break;
                        case 3:
                            total +=190;
                            System.out.println("Manchurian Added! ");
                            break;
                        default:

                            System.out.println("Ivalid Dish! ");

                    }
                    break;
                case 4:
                    System.out.println("\n---Russian Dishes---");
                    System.out.println("1. Borschit = 250");
                    System.out.println("2. Pelmeni = 300");
                    System.out.println("3. Blini = 180");
                    System.out.println("Select Dish: ");
                    item = sc.nextInt();
                    switch (item){
                        case 1:
                            total +=250;
                            System.out.println("Borscht Added!");
                            break;
                        case 2:
                            total +=300;
                            System.out.println("Pelmeni Added!");
                            break;
                        case 3:
                            total +=200;
                            System.out.println("Blini Added!");
                            break;

                        default:

                            System.out.println("Invailid Dish!");


                    }
                    break;
                case 5:
                    System.out.println("\nThank You!");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice !=5);
        System.out.println("\n=====FINAL BILL====");
        System.out.println("Total price = " + total);

        sc.close();



    }
}
