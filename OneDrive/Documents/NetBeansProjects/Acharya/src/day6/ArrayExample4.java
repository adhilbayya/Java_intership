package day6;

import java.util.Scanner;

public class ArrayExample4 {
    public static void main(String[] args) {
        int matrix1[][] = new int[3][3];
        int matrix2[][] = new int[3][3];
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter matrix 1 values: ");
        for(int i = 0; i < matrix1.length; i++){
            for(int j = 0; j < matrix1.length;j++){
                matrix1[i][j] = sc.nextInt();
            }
            System.out.println();
        }
        
        System.out.println("Enter matrix 2 values: ");
        for(int i = 0; i < matrix1.length; i++){
            for(int j = 0; j < matrix1.length;j++){
                matrix2[i][j] = sc.nextInt();
            }
            System.out.println();
        }
        
        System.out.println("Matrix 1 elements are : ");
        for(int i = 0; i < matrix1.length; i++){
            for(int j = 0; j < matrix1.length;j++){
                System.out.print(matrix1[i][j] + " ");
            }
            System.out.println();
        }
        
        System.out.println("Matrix 2 elements are : ");
        for(int i = 0; i < matrix1.length; i++){
            for(int j = 0; j < matrix1.length;j++){
                System.out.print(matrix2[i][j] + " ");
            }
            System.out.println();
        }
        
        System.out.println("The sum of the matrix : ");
        for(int i = 0; i < matrix1.length; i++){
            for(int j = 0; j < matrix1.length;j++){
                System.out.print(matrix1[i][j] + matrix2[i][j] + " ");
            }
            System.out.println();
        }
    }
}
