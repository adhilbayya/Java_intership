package day3;

import java.util.Scanner;

public class SwitchExample2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to MTR Hotel");
        System.out.println("Here is the menu");
        System.out.println("Menu");
        System.out.println("1. Dosa -> 100");
        System.out.println("2. Idly -> 50");
        System.out.println("3. Vada -> 30");
        System.out.println("4. Coffee -> 10");
        System.out.println("5. Gulab jamun -> 40");
        System.out.println("Enter your choice?");
        int choice = sc.nextInt();
        System.out.println("Enter the Number of items? ");
        float totalNo = sc.nextInt();
        switch(choice){
            case 1: 
                System.out.println("Thankyou for ordering dosa");
                System.out.println("Total = "+totalNo * 100);
                break;
                
            case 2: 
                System.out.println("Thankyou for ordering idly");
                System.out.println("Total = "+totalNo * 50);
                break;
                
            case 3: 
                System.out.println("Thankyou for ordering Vada");
                System.out.println("Total = "+totalNo * 30);
                break;
                
            case 4: 
                System.out.println("Thankyou for ordering Coffee");
                System.out.println("Total = "+totalNo * 10);
                break;
                
            case 5: 
                System.out.println("Thankyou for ordering Gulab jamun");
                System.out.println("Total = "+totalNo * 40);
                break;
                
            default: 
                System.out.println("The item you have ordered is not in the menu !");
                break;
        }
        System.out.println("Your order is on the way please contact mr x");
    }
}
