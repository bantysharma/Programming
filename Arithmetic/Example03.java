package Arithmetic;
//Write a Java program that takes one integer as input, divides it by 10, and prints both the quotient and the remainder.

import java.util.Scanner;

public class Example03 {
    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);

        int a =sc.nextInt();

        int quotient =a/10;
        int remainder =a%10;

        System.out.println("quotient" +quotient);
        System.out.println("remainder" +remainder);



    }
}
