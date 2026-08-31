package Relations;

import java.util.Scanner;

public class Example06 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        int a = sc.nextInt();
        int b=sc.nextInt();

        boolean greater = a > b;
        boolean less = a < b;
        boolean equal = a == b;

        System.out.println("Greater = " + greater);
        System.out.println("Less = " + less);
        System.out.println("Equal = " + equal);


    }
}
