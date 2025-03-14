package com.javadeveloper;

import java.time.Year;

public class Samochod {

    private final String  marka;
    private  final  String model;
    private final  int rocznik;
    private int przebieg;
    private double spalenie;
    private int predkoscMaksymalna;
private int predkoscAktualna;
private double pojemnoscZbiornika;
private double stanPaliwa;
private String numerRejestracyjny;

public Samochod(String  marka, String model,int rocznik,int przebieg, double spalenie,int predkoscMaksymalna, int predkoscAktualna,double pojemnoscZbiornika,double stanPaliwa, String numerRejestracyjny ) {
if(rocznik <= 0) {
    rocznik = Year.now().getValue();
}
this.marka = marka;
this.model = model;
this.rocznik = rocznik;
this.przebieg = przebieg;
this.spalenie = spalenie;
this.predkoscMaksymalna = predkoscMaksymalna;
this.pojemnoscZbiornika = pojemnoscZbiornika;
this.numerRejestracyjny = numerRejestracyjny;
this.predkoscAktualna = 0;
this.stanPaliwa = 0;

}

    public int zwrocWiek() {
        return Year.now().getValue() - rocznik;
    }

    public void zmienNrRej(String nowyNumer) {
        this.numerRejestracyjny = nowyNumer;
    }

    public void przyspiesz(int wartosc) {
        this.predkoscAktualna = Math.min(predkoscAktualna + wartosc, predkoscMaksymalna);
    }

    public void zwolnij(int wartosc) {
        this.predkoscAktualna = Math.max(predkoscAktualna - wartosc, 0);
    }

    public void zatankuj(double ilosc) {
        this.stanPaliwa = Math.min(stanPaliwa + ilosc, pojemnoscZbiornika);
    }

    public void zatankujDoPelna() {
        this.stanPaliwa = pojemnoscZbiornika;
    }

    public boolean czyPusty() {
        return stanPaliwa <= 0;
    }

    public boolean czyPelny() {
        return stanPaliwa >= pojemnoscZbiornika;
    }














}
