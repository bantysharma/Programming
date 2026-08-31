package Arithmetic;

import java.util.Scanner;

//Write a Java program that takes two integers as input:
//Total marks
//Obtained marks
//Calculate and print the percentage.
public class Example05 {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        int markObtained =sc.nextInt();
        int totalMarks =sc.nextInt();
        double percentage =(markObtained*100.0)/totalMarks;
        System.out.println(percentage);

    }
}
