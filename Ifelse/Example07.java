package Ifelse;

import java.util.Scanner;

public class Example07{
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            System.out.print("Enter temperature: ");
            int temperature = sc.nextInt();

            if (temperature < 15) {
                System.out.println("Cold");
            } else if (temperature <= 30) {
                System.out.println("Normal");
            } else {
                System.out.println("Hot");
            }
        }
    }


