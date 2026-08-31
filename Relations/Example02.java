package Relations;

//Write a Java program that takes two integers as input and checks whether they are equal or not equal.

import java.util.Scanner;

public class Example02 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a =sc.nextInt();
        int b=sc.nextInt();

        if(a==b){
            System.out.println("equal");
        }else{
            System.out.println("not equal");
        }
    }
}
