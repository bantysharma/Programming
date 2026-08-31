package Arithmetic;
//Do integers ka quotient aur remainder nikalo.
import java.util.Scanner;

public class Example01 {
    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        int a =sc.nextInt();
        int b= sc.nextInt();

        int quotient=a/b;
        int remainder=a%b;

        System.out.println("quotient"+ quotient);
        System.out.println("remainder"+ remainder);




    }
}
