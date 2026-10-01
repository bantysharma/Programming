package Ifelse;
//Write a Java program that takes one character as input and prints:
//
//Alphabet → if the character is A-Z or a-z
//Digit → if the character is 0-9
//Special Character → for any other character
import java.util.Scanner;

public class Example08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch =sc.next().charAt(0);

        if((ch>='A'&& ch<='z')||(ch>='a' && ch<='z')){
            System.out.println("ALPHABET");
        } else if (ch>='0'&&ch<='9'){
            System.out.println("number");
        }
        else{
            System.out.println("Special Character");
        }


    }
}
