package com.javadeveloper;



 class Main {


    public static void main(String[] args) {

        Prostokat prostokat = new Prostokat(4, 2);

        System.out.println("Opis prostakata: ");
        System.out.println("Dlugosc wynosi: " + prostokat.getDlugosc());
        System.out.println("Szerokosc wynosi: " + prostokat.getSzerokosc());
        System.out.println( "Pole wynosi: " + prostokat.poleProstokata());
        System.out.println( "Obwod wynosi: " + prostokat.obwodProstakata());
        System.out.println("Dlugosc wynosi: " + prostokat.dlugoscPrzekatnej());




    }


}






