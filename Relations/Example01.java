package Relations;

import java.util.Scanner;

//Write a Java program that takes two integers as input and prints which number is greater.
//Input:25  //18
public class Example01 {
    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);

        int a =sc.nextInt();
        int b =sc.nextInt();

        if(a>b){
            System.out.println("A is Greater");
        }
        else{
            System.out.println("B is greater number");
        }
    }
}
