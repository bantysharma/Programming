package Logical;

import java.util.Scanner;
//Write a Java program that takes one integer as input and checks whether the number is NOT equal to 10.
public class Example05 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        int number =sc.nextInt();
        if(number!=10){
            System.out.println("its not queal to 10");
        }else{
            System.out.println("it eqoual to 10");
        }

    }
}
