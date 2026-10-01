package Ifelse;
//Write a Java program that takes three side lengths as input and prints the type of triangle:
//
//Equilateral → all three sides are equal
//Isosceles → exactly two sides are equal
//Scalene → all three sides are different
import java.util.Scanner;

public class Example12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a == b && b == c) {
            System.out.println("Equilateral");
        } else if (a == b || b == c || a == c) {
            System.out.println("Isosceles");
        } else {
            System.out.println("Scalene");
        }
    }


    }
