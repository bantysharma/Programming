package AirthmeticCalculation;

import java.util.Scanner;

public class Example03 {
    public  static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b =sc.nextInt();

        int quotien =a/b;
        int remainder = a%2;

        System.out.println(quotien);
        System.out.println(remainder);



    }
}
