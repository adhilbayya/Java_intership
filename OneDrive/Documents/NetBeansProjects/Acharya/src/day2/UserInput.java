package day2;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your name: ");
        String name = sc.next();
        System.out.println("What is your age: ");
        int age = sc.nextInt();
        System.out.println("What do you learn");
        String course = sc.next();
        System.out.println("Welcome "+name+" You are "+age+" years old and you are studying "+course);
    }
}
