package com.javadeveloper;

import java.util.Scanner;

class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть число: ");
        int number = scanner.nextInt();


        int result = factorial(number);


        System.out.println("Факторіал числа " + number + " дорівнює: " + result);

        scanner.close();
    }


    public static int factorial(int n) {
        int result = 1;


        for (int i = 1; i <= n; i++) {
            result *= i;
        }

        return result;






    }


}






