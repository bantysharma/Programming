package Ifelse;

import java.util.Scanner;

public class Example14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int age = sc.nextInt();
        int marks = sc.nextInt();

        if (age >= 18 && marks >= 60) {
            System.out.println("Eligible");
        } else {
            System.out.println("Not Eligible");
        }
    }
    }

