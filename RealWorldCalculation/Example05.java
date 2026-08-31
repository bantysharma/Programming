package RealWorldCalculation;

import java.util.Scanner;

public class Example05 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        int math = sc.nextInt();
        int phy =sc.nextInt();
        int chem =sc.nextInt();
        int eng= sc.nextInt();
        int bio =sc.nextInt();

        int total =math+phy+chem+eng+bio;
        double percentage =(total/500.0)*100;

        System.out.println("Total = " + total);
        System.out.println("Percentage = " + percentage);

    }
}
