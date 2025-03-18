package com.javadeveloper;

public class Pracownik {
    private String imie;
    private String nazwisko;
    private double stawka;
    private double godz;
    private double premia;

    public Pracownik(String imie, String nazwisko, double stawka, double godz, double premia) {

        this.imie = imie;
        this.nazwisko = nazwisko;
        this.stawka = stawka;
        this.godz = godz;
        this.premia = premia;

    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public double obliczPodstawoweWynagrodzenie() {
        return stawka * godz;
    }

    public double obliczPelneWynagrodzenie() {
        return premia + (stawka * godz);
    }

    public void zmienPremie(double nowaPremia) {
        this.premia = nowaPremia;
    }

    public  void dajPodwyzke (double zwiekszenieStawki) {
        this.godz = godz + zwiekszenieStawki;
    }

    public  boolean czyJestPremia () {
        if (premia > 0) {
            return true;
        }else {
            return  false;
        }
    }




    public void wyswietl () {
        System.out.println("Imie pracownika " + imie);
        System.out.println("Nazwisko pracownika: "  + nazwisko);
        System.out.println("Stawka" + stawka);
        System.out.println("Przepracowane godziny: ");
        System.out.println("Premia: " + premia);
    }




}
