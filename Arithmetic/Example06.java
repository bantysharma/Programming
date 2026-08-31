package Arithmetic;

import java.util.Scanner;

public class Example06 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int a =sc.nextInt();
        int b =sc.nextInt();

        int intresult =a/b;
        double doubleresult=(double)a/b;

        System.out.println(intresult);
        System.out.println(doubleresult);
    }
}
