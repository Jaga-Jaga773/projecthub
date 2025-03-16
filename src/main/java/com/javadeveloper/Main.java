package com.javadeveloper;



 class Main {


    public static void main(String[] args) {

        Student student = new Student("Jake", 18,85);
        Student student1 = new Student("Jon", 23, 95);


        student.displayInfo();
        student1.displayInfo();


        student.isExcellentStudent();
        student1.isExcellentStudent();
    }


}






