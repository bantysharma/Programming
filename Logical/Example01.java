package Logical;
//Write a Java program that takes one integer as input and checks whether the number is both positive AND even.

import java.util.Scanner;

public class Example01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int number =sc.nextInt();

        if(number>0 && number==0){
            System.out.println("its a postive and even number");
        }else {
            System.out.println("its a not postive or even number ");
        }
    }
}
