package by.epam.arraysOfArrays.task5;

import java.util.Scanner;

/*Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):*/

public class Main {
    public static void main(String[] args) {
    	
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the size of array = ");
        int n = scanner.nextInt();
        while (n % 2 != 0) {
            System.out.println("Invalid value of n, try again");
            n = scanner.nextInt();
        }
        int[][] array = new int[n][n];
        System.out.println("Input the elements of array: ");

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - i; j++) {
                array[i][j] = scanner.nextInt();
            }
            System.out.println();
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
