package BasicInputOutput;

import java.util.Scanner;

public class Example02 {
    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        double b = sc.nextDouble();
        char c = sc.next().charAt(0);

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

    }
}
