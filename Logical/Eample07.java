package Logical;

import java.util.Scanner;
//Write a Java program that takes two integers as input and checks whether both numbers are positive
//and the first number is greater than the second number.
public class Eample07 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        int numb =sc.nextInt();
        int numb2 =sc.nextInt();
        if(numb>0 && numb2>0 && numb>numb2){
            System.out.println(true);
        }else{
            System.out.println(false);
        }

    }
}
