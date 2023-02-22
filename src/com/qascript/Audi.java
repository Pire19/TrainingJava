package com.qascript;

public class Audi {
    public static void main(String[] args) {

        Car audi = new Car();
        audi.setColor("red");
        audi.setSize(60);
        audi.setWeight(21.50);
        audi.displayCar();

        Car.accelerate();
        Car.start();

    }


}
