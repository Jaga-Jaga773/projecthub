package com.javadeveloper;



 class Main {


    public static void main(String[] args) {

Samochod samochod = new Samochod("Toyota", "Corolla", 2015, 700, 4, 180, 140, 30, 5, "TYU4673");
samochod.wyswietl();

samochod.wykonajTuning(50);
samochod.wyswietl();

samochod.zmienNrRej("rt5789");
samochod.wyswietl();

samochod.jedz(120);
samochod.wyswietl();

samochod.przypiesz(4);
samochod.wyswietl();





    }


}






