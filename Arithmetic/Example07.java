package Arithmetic;
//Ek integer input lo aur check karo ki kya woh 5 se completely divisible hai. Remainder operator (%) ka use karo.
import java.util.Scanner;

public class Example07 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        
        int a = sc.nextInt();

        int remainder= a%5;

        System.out.println(remainder);
    }
}
