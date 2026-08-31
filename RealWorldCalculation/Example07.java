package RealWorldCalculation;

import java.util.Scanner;

public class Example07 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        int salary =12000;

        double hike =sc.nextDouble();

        double hikeamount =(salary*hike)/100;
        double finalsalary =salary+hikeamount;

        System.out.println(finalsalary);


    }
}
