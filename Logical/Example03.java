package Logical;
//Number 2, 3 ya 5 mein se kisi ek se divisible hai ya nahi.
import java.util.Scanner;

public class Example03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number =sc.nextInt();

        if(number%2==0|| number%3==0 ||number%5==0){
            System.out.println("its a divisble of 2,3,5");
        }else{
            System.out.println("its a not divisble of 2,3,5");
        }


    }
}
