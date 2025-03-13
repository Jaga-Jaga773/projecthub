package com.javadeveloper;



 class Main {


    public static void main(String[] args) {
        Disc.setVat(23.0);

        // Створення об'єкта диска
        Disc disc = new Disc("IBM", 2048, 330.0);

        // Виведення інформації про диск
        System.out.println(disc);

        // Виведення ціни з ПДВ
        System.out.println("Cena brutto: " + disc.getBruttoPrice() + " PLN");

    }


}






