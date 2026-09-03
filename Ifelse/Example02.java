package Ifelse;

import java.util.Scanner;
//greates of two
public class Example02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 20, b = 30, c = 10;
        int big = a;
        if (b > big)
            big = b;
        if (c > big)
            big = c;
        System.out.println(big);
    }
}
