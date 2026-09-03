package Ifelse;

import java.util.Scanner;
//Write a Java program that takes the cost price and selling price of a product as input
// and prints whether the seller has made a profit or a loss.
public class Example01 {

    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        int costprice =sc.nextInt();
        int sellingprice =sc.nextInt();


        if(sellingprice>costprice){
            System.out.println("its a profit");

        }else if (sellingprice<costprice) {
            System.out.println("loss");
        }else{
            System.out.println("no loss no profit");
        }
    }
}
