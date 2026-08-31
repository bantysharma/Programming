package Logical;
//Write a Java program that takes one integer as input and checks whether the number is divisible by both 3 AND 5.
import java.util.Scanner;

public class Example02 {
    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        int number =sc.nextInt();

        if(number%3==0 && number%5==0){
            System.out.println("its a divisible");
        }else{
            System.out.println("its not divisible");
        }

    }
}
