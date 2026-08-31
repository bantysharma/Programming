package Relations;

import java.util.Scanner;

public class Example05 {
    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);

        int a =sc.nextInt();

        if(a>=18&&a<=60){
            System.out.println("valid age");
        }
        else{
            System.out.println("invalid");
        }
    }

}
