package BasicInputOutput;

import java.util.Scanner;

public class Example04 {
    public static void main(String[]args){

        Scanner sc =new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        TwoSum.add(a,b);

    }
    class TwoSum {
        static void add(int a, int b) {
            System.out.println(a + b);
        }
    }
}
