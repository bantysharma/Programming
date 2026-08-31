package Logical;

import java.util.Scanner;
//9. Number teenon 2, 3, 5 se divisible hai ya nahi.
public class Example04 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int number =sc.nextInt();
        if(number/2==0 && number/3==0&& number/5==0){
            System.out.println("div by 2,3,5");
        }else{
            System.out.println("not div bye 2,3,5");
        }


    }
}
