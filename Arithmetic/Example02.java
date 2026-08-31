package Arithmetic;

import java.util.Scanner;

//Write a Java program that takes an integer as input and prints its last digit using the remainder operator (%).
public class Example02 {
    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);

        int a =sc.nextInt();

        int remainder =a%10;

        System.out.println(remainder);
    }
}
