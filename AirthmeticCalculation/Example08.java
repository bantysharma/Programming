package AirthmeticCalculation;

import java.util.Scanner;

public class Example08 {
    public static void main(String[]args){

        Scanner sc=new Scanner(System.in);

        int a =sc.nextInt();
        int b =sc.nextInt();

        a=a+b;
        b=a-b;
        System.out.println(a);
        System.out.println(b);
    }
}
