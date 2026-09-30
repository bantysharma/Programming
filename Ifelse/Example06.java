package Ifelse;

import java.util.Scanner;

public class Example06 {
        public static void main(String[] args) {

            Scanner sc =new Scanner(System.in);
            double purchaseAmount= sc.nextDouble();

            double discount;

            if(purchaseAmount>5000){
                discount=purchaseAmount*20/100;
            }
            else if (purchaseAmount >3000){
                discount =purchaseAmount*15/100;
            }
            else if (purchaseAmount >1000){
                discount =purchaseAmount*10/100;
            }
            else{
                discount=0;
            }

            double finalAmount=purchaseAmount-discount;
            System.out.println("discountamount"+discount);
            System.out.println(finalAmount);


        }
}