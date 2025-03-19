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

    public void dajPodwyzke(double zwiekszenieStawki) {
        this.stawka += zwiekszenieStawki;
    }

    public boolean czyJestPremia() {
        return premia > 0;
    }

    // Metoda wiecejPracuje
    public boolean wiecejPracuje(Pracownik innyPracownik) {
        return this.godz > innyPracownik.godz;
    }

    public void wyswietl() {
        System.out.println("Imie pracownika: " + imie);
        System.out.println("Nazwisko pracownika: " + nazwisko);
        System.out.println("Stawka godzinowa: " + stawka + " PLN");
        System.out.println("Przepracowane godziny: " + godz);
        System.out.println("Premia: " + premia + " PLN");
        System.out.println("Podstawowe wynagrodzenie: " + obliczPodstawoweWynagrodzenie() + " PLN");
        System.out.println("Pełne wynagrodzenie: " + obliczPelneWynagrodzenie() + " PLN");
    }







}
