/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaloops;

import java.util.Scanner;

/**
 *
 * @author DouglasD
 */
public class JavaLoops {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        int choice;
        do {
            System.out.println("Choose what you want to eat from the menu below");
            System.out.println("1. Jamaican Jerk Chicken.");
            System.out.println("2. Jamaican Style Hotdog.");
            System.out.println("3. Cheeseburger");
            System.out.println("4. Jamaican Patties.");
            choice = in.nextInt();
        } while (choice != 1 && choice != 2 && choice != 3 && choice != 4);
        switch (choice) {
            case 1:
                System.out.println("Your choice was Jamaican Jerk Chicken.");
                break;
            case 2:
                System.out.println("Your choice was Jamaican Style Hotdog");
                break;
            case 3:
                System.out.println("Your choice was Cheeseburger");
                break;
            case 4:
                System.out.println("Your choice was Jamaican Patties.");
                break;
            default:
                System.out.println("It looks like your meal is free!");
        }

        /*
        Below is the loan problem
         */
        double loanBalance = 5000;
        int months = 0;
        //We will pay 500 on the loan a month
        while (loanBalance > 0) {
            loanBalance -= 500;
            months++;
        }

        System.out.println("You will pay off this loan in " + months);

        //Below we will do a forloop to print all odd numbers between 1-100;
        for (int i = 0; i <= 100; i++) {
            if (i % 2 != 0) {
                System.out.println(i + " is odd.");
            }
        }
    }

}
