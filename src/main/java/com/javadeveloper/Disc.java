package com.javadeveloper;

 class Disc{
    private static double vat;

    private String model;
    private int capacity; // в MB
    private double price; // ціна без ПДВ

    // Конструктор без параметрів
    public Disc() {
        this.model = "Unknown";
        this.capacity = 0;
        this.price = 0.0;
    }

    // Конструктор з параметрами
    public Disc(String model, int capacity, double price) {
        this.model = model;
        this.capacity = capacity;
        this.price = price;
    }

    // Гетери та сетери
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public static double getVat() {
        return vat;
    }

    public static void setVat(double vat) {
        Disc.vat = vat;
    }

    // Метод обчислення ціни з ПДВ
    public double getBruttoPrice() {
        return price * (1 + vat / 100);
    }

    // Метод, що повертає інформацію про диск
    public String toString() {  // Без @Override, але все ще перевизначає метод Object.toString()
        return "Model: " + model + ", Pojemność: " + capacity + " MB";
    }



}
