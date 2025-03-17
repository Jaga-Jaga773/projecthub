package com.javadeveloper;

public class Samochod {

    private  final  String marka;
    private  final String model;
    private  final  int rocznik;

    private  double przebiek;
    private double spalenie;
    private double predkoscMaksymalna;
    private double predkoscAktualna;
    private double pojemnoscZbiornika;
    private double stanPaliwa;
    private String numerRejestracyjny;


    public Samochod(String marka, String model, int rocznik,double przebiek,double spalenie,int predkoscMaksymalna,int predkoscAktualna,double pojemnoscZbiornika, double stanPaliwa, String numerRejestracyjny ) {

        this.marka = marka;
        this.model = model;
        this.rocznik = 2025;
        this.przebiek = 0;
        this.spalenie = spalenie;
        this.predkoscMaksymalna = predkoscMaksymalna;
        this.predkoscAktualna = 0;
        this.pojemnoscZbiornika = pojemnoscZbiornika;
        this.stanPaliwa = 0;
        this.numerRejestracyjny = numerRejestracyjny;


    }

    public  String getMarka() {
        return  marka;
    }

    public  String getModel() {
        return model;
    }

    public  int zwrocWiek(){
        return rocznik;
    }

    public double getPrzebiek() {
        return  przebiek;
    }

    public double getSpalenie() {
        return spalenie;
    }

    public double  getpredkoscMaksymalna () {
        return  predkoscMaksymalna;
    }

    public double getPredkoscAktualna() {
        return  predkoscAktualna;
    }

    public  double getPojemnoscZbiornika () {
        return pojemnoscZbiornika;
    }

    public double getStanPaliwa () {
        return  stanPaliwa;
    }

    public  String  getNumerRejestracyjny () {
        return  numerRejestracyjny;
    }

    public void  zmienNrRej (String newNumer) {
        this.numerRejestracyjny = newNumer;
    }

    public  void  przypiesz( double wartosc ) {
        predkoscAktualna += wartosc;
        if(predkoscAktualna > predkoscMaksymalna){
            predkoscAktualna = predkoscMaksymalna;
        }
    }

    public  void  zwolnij( double wartosc) {
        predkoscAktualna -= wartosc;
        if(predkoscAktualna < 0){
            predkoscAktualna = 0;
        }
    }

    public void  ztankuj (double wartosc) {
        stanPaliwa += wartosc;
        if(stanPaliwa > 0){
            stanPaliwa = pojemnoscZbiornika;
        }
    }

    public  void  zatankujDoPelna () {
        stanPaliwa = pojemnoscZbiornika;
    }

    public  boolean  czyPusty () {
        if(stanPaliwa > 0) {
            return  true;
        } else {
            return  false;
        }

    }

    public  boolean czyPelny () {
        if (stanPaliwa < 0) {
            return  true;
        }else {
            return  false;
        }
    }

    public  void wyswietl () {

        System.out.println("Marka: " + marka);
        System.out.println("Model: " + model);
        System.out.println("Rocznik: " + rocznik);
        System.out.println("Przebieg: " + przebiek);
        System.out.println("Spalenie: " + spalenie + "1/100km");
        System.out.println("Predkosc maksymalna: "  + predkoscMaksymalna + "km/h");
        System.out.println("Predkosc aktualna: " + predkoscAktualna + "km/h");
        System.out.println("Pojemnosc zbiornika: " + pojemnoscZbiornika);
        System.out.println("Stan paliwa: " + stanPaliwa);
        System.out.println("Numer rejestracyjny: " + numerRejestracyjny);

    }

    public  void zatrzymajsie() {
        predkoscAktualna = 0;
    }

    public void wykonajTuning (double zwiekszeniePredkosci) {
        predkoscMaksymalna += zwiekszeniePredkosci;
    }

    public void  jedz (double dystans) {
        double potrzebnePaliwo = (spalenie / 100) * dystans;
        if (stanPaliwa >= potrzebnePaliwo) {
            przebiek += dystans;
            stanPaliwa -= potrzebnePaliwo;
        } else {
            System.out.println("Brak wystarczajacej ilosci paliwa!");
        }


    }


}
