package Ifelse;
//Write a Java program that takes three side lengths as input and checks whether they can form a valid triangle.
//
//Print:
//
//Valid Triangle → if the sum of any two sides is greater than the third side.
//Invalid Triangle → otherwise.
import java.util.Scanner;

public class Example11 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a + b > c && b + c > a && a + c > b) {
            System.out.println("Valid Triangle");
        } else {
            System.out.println("Invalid Triangle");
        }
    }
}