package com.javadeveloper;

public class Prostokat {


        private double dlugosc;
        private double szerokosc;

        public Prostokat () {}


        public Prostokat (double dlugosc, double szerokosc ) {
            this.dlugosc = dlugosc;
            this.szerokosc = szerokosc;


        }

        public double getDlugosc () {
            return  dlugosc;
        }

        public double getSzerokosc() {
            return szerokosc;
        }

        public void setDlugosc(double dlugosc) {
            this.dlugosc = dlugosc;
        }

        public void setSzerokosc(double szerokosc) {
            this.szerokosc = szerokosc;
        }

        public double poleProstokata() {
            return dlugosc * szerokosc;
        }

        public double obwodProstakata() {
            return  2 * ( dlugosc + szerokosc);
        }
        public double dlugoscPrzekatnej () {
            return Math.sqrt((dlugosc * dlugosc) + (szerokosc * szerokosc));
        }




    }









