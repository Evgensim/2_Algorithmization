package by.epam.method.task6;

import java.util.Scanner;

/*Написать метод(методы), проверяющий, являются ли данные три числа взаимно простыми.*/

public class Main {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        System.out.println("Enter 3 primes");
        int a = scn.nextInt();
        int b = scn.nextInt();
        int c = scn.nextInt();

        if (Vzaim(Vzaim(a,b),c) == 1){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
    }

    public static int Vzaim(int a, int b){
        while (a != b){
            if (a > b){
                a = a - b;
            } else
            {
                b = b - a;
            }
        }
        return a;

    }
}
