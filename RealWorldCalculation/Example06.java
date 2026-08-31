package RealWorldCalculation;

import java.util.Scanner;

public class Example06 {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);

        int product =1000;
        double dis =sc.nextDouble();

        double discountam =(product*dis)/100;
        double finalresult= product-discountam;

        System.out.println(finalresult);

    }
}
