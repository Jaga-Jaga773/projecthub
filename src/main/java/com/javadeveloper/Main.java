package com.javadeveloper;

import java.util.Scanner;

class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj rozmiar tablicy: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];


        System.out.println("Podaj " + n + " liczb calkowitych do tablicy:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int maxNumber = findMax(arr);
        System.out.println("Najwieksza liczba w tablicy to: " + maxNumber);
    }


    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;


    }

}






