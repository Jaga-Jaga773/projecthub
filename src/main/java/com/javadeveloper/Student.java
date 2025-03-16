package com.javadeveloper;

public class Student {

    private String name;
    private int age;
    private double averageGrade;


    public Student(String name, int age, double averageGrade) {

        this.name = name;
        this.age = age;
        this.averageGrade = averageGrade;

    }

    public void changeName(String anotherName) {
        this.name = anotherName;

    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else
            System.out.println("Помилка! Ти подав неправдивий вік");

    }

    public boolean isExcellentStudent() {
        if (averageGrade >= 90) {
            System.out.println("Це відмінник!");
            return true;
        } else
            return false;

    }

    public  void displayInfo () {
        System.out.println(" Імя студента: " + name +" \nВік студента: " + age + "\nСередня Оцінка студента: " + averageGrade );

    }







}
