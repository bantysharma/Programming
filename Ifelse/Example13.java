package Ifelse;

import java.util.Scanner;

public class Example13 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int day = sc.nextInt();
    int month = sc.nextInt();
    int year = sc.nextInt();

    boolean valid = false;

        if (month >= 1 && month <= 12) {

        if (month == 2) {
            if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
                valid = (day >= 1 && day <= 29);
            } else {
                valid = (day >= 1 && day <= 28);
            }

        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            valid = (day >= 1 && day <= 30);

        } else {
            valid = (day >= 1 && day <= 31);
        }
    }

        if (valid) {
        System.out.println("Valid Date");
    } else {
        System.out.println("Invalid Date");
    }
}

}
