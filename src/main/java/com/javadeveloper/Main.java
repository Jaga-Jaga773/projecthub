package com.javadeveloper;

import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Podaj liczbę: ");
        int num = scan.nextInt();


        if (isPrime(num)) {
            System.out.println("Liczba " + num + " jest pierwsza.");
        } else {
            System.out.println("Liczba " + num + " nie jest pierwsza.");
        }
    }

    public static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}






