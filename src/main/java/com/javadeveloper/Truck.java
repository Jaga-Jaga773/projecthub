package com.javadeveloper;

public class Truck {

    private boolean isLoaded;

    public Truck(float speed, int weight, String color, boolean isLoaded) {

        this.isLoaded = isLoaded;

    }

    public void setLoaded(boolean isLoaded){
        this.isLoaded = isLoaded;
    }

    public  void getLoaded(){
        if(isLoaded)
            System.out.println("Truck is loaded");
        else
            System.out.println("Truck is not loaded");
    }


}
