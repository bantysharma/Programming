package Ifelse;
//Write a Java program that takes temperature in Celsius (°C) as input and prints:
//
//Cold → temperature is below 15°C
//Normal → temperature is 15°C to 30°C
//Hot → temperature is above 30°C

import java.util.Scanner;

public class Example07{
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int Celsius =sc.nextInt();

            if(Celsius<15){
                System.out.println("cold");
            } else if (Celsius<=30) {
                System.out.println("normal");
            } else  {
                System.out.println("hot");
            }
        }
}


