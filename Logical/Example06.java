package Logical;

import java.util.Scanner;

//Write a Java program that takes three integers as input and calculates:
public class Example06 {
    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        int firstnum =sc.nextInt();
        int secondnum =sc.nextInt();
        int thirdnum =sc.nextInt();


        int cal =(firstnum+secondnum)*thirdnum;
        System.out.println(cal);

    }
}
