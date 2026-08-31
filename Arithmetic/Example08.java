package Arithmetic;
//Do integers input lo. Pehle dono numbers ka sum nikalo. Phir us sum ko 5 se multiply karo. Final result print karo.
import java.util.Scanner;

public class Example08 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a =sc.nextInt();
        int b =sc.nextInt();

        int sum =a+b;
        int multi =sum*5;
        System.out.println(multi);
    }
}
