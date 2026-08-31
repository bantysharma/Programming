package RealWorldCalculation;

import java.util.Scanner;

public class Example08 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        int second=sc.nextInt();

       int hr =second/3600;
       int remaingsecond =second%3600;

       int minutes =remaingsecond/60;
       int remainsec =remaingsecond%60;

        System.out.println("Hours = " + hr);
        System.out.println("Minutes = " + minutes);
        System.out.println("Seconds = " + remainsec);



    }
}
