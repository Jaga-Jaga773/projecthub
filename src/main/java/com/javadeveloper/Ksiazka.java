package com.javadeveloper;

public class Ksiazka {

private  String tytul;
private  String autor;
private int rokWydania;
private int liczbaStron;
private boolean czyPrzeczytana;


public Ksiazka(String tytul, String autor, int rokWydania,int liczbaStron,boolean czyPrzeczytana ) {
   this.tytul = tytul;
   this.autor= autor;
   this.rokWydania = rokWydania;
   this.liczbaStron = liczbaStron;
   this.czyPrzeczytana = czyPrzeczytana;

}




public  void zmienTytul(String nowyTytul){
    this.tytul = nowyTytul;
}

public  void  zmienAutor(String nowyAutor ){
    this.autor = nowyAutor;
}

public void  setYear(int rokWydania){
    if ( rokWydania > 0){
        this.rokWydania = rokWydania;
    } else  {
        System.out.println("Nieprawdziwy rok wydania!");
    }

}


public void setLiczbaStron(int liczbaStron){
    if ( liczbaStron > 0) {
      this.liczbaStron = liczbaStron;
    } else {
        System.out.println("Nieprawdziwa liczba stron!");
    }

}

public void  setRead(boolean czyPrzeczytana){
    this.czyPrzeczytana = czyPrzeczytana;
}

public  void przeczytajKsiazke() {
    this.czyPrzeczytana = true;
    System.out.println("Ksiazka" + tytul + "Poznaczona jak proczytana!");
}

public void wyswietlInfo () {

    System.out.println("Kziazka: " + tytul + ", Autor: " + autor + ",Rok wydania: " + rokWydania + ",Przeczytana ?" + czyPrzeczytana );


}





}
