package RealWorldCalculation;
//rectange ka primeter

import java.util.Scanner;

public class Example02 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        int length =sc.nextInt();
        int breadth =sc.nextInt();

        int perimter =2*(length+breadth);

        System.out.println(perimter);
    }
}
