package Ifelse;

import java.util.Scanner;

public class Example06 {
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            System.out.print("Enter purchase amount: ");
            double amount = sc.nextDouble();

            double discountPercentage;

            if (amount >= 5000) {
                discountPercentage = 20;
            } else if (amount >= 3000) {
                discountPercentage = 15;
            } else if (amount >= 1000) {
                discountPercentage = 10;
            } else {
                discountPercentage = 0;
            }

            double discountAmount = amount * discountPercentage / 100;
            double finalAmount = amount - discountAmount;

            System.out.println("Discount = " + discountAmount);
            System.out.println("Final Amount = " + finalAmount);
        }
    }

