package day2;

import java.util.Scanner;

public class ConditionalExample {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the charecter: ");
        char num = sc.next().charAt(0);
        if (num == 'a' || num == 'e' || num == 'i' || num == 'o' || num =='u') {
            System.out.println("Vowel");
        } else {
            System.out.println("consonant");
        }
    }
}
