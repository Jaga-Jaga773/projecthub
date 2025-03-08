package com.javadeveloper;

import java.util.ArrayList;
import java.util.Scanner;



public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> shoppingList = new ArrayList<>();

        while (true) {
            System.out.println("\nМеню:");
            System.out.println("1 - Додати товар");
            System.out.println("2 - Видалити товар");
            System.out.println("3 - Показати список");
            System.out.println("4 - Вийти");
            System.out.print("Виберіть опцію: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Очищення після введення числа

            switch (choice) {
                case 1:
                    System.out.print("Введіть назву товару: ");
                    String item = scanner.nextLine();
                    shoppingList.add(item);
                    System.out.println("Товар додано!");
                    break;
                case 2:
                    System.out.print("Введіть назву товару для видалення: ");
                    String removeItem = scanner.nextLine();
                    if (shoppingList.remove(removeItem)) {
                        System.out.println("Товар видалено!");
                    } else {
                        System.out.println("Товар не знайдено!");
                    }
                    break;
                case 3:
                    System.out.println("Ваш список покупок:");
                    for (String s : shoppingList) {
                        System.out.println("- " + s);
                    }
                    break;
                case 4:
                    System.out.println("Програма завершена.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Невідома опція, спробуйте ще раз.");
            }
        }
    }
}






