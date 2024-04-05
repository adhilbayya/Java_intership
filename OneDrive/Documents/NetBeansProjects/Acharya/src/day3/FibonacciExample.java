package day3;

import java.util.Scanner;

public class FibonacciExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of fibonacci: ");
        int num = sc.nextInt();
        int startNum = 0;
        int nextNum = 1;
        for(int i = 2; i <= num; i++){
            int nextTerm = startNum + nextNum;
            startNum = nextNum;
            nextNum = nextTerm;
            System.out.println(nextTerm);
        }
    }
}
