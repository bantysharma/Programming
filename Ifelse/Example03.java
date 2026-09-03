package Ifelse;

import java.util.Scanner;

public class Example03 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int year =sc.nextInt();
        if(year%4==0 &&year%100!=0){
            System.out.println("leap year");
        }else{
            System.out.println("ita a not leap year");
        }
    }
}
