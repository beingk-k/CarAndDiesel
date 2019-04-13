package com.e.caranddiesel;

public class CarAndDiesel {

    private String make, year, color, price, enginesize;

    public CarAndDiesel(String make, String year, String color, String price, String enginesize) {
        this.make = make;
        this.year = year;
        this.color = color;
        this.price = price;
        this.enginesize = enginesize;
    }

    public String result(){
        return ("Manufacturer: "+ make + ", Current Value: "+ price + ", Effective Engine Size: " + enginesize);
    }
}
