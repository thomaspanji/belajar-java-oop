package belajar.programming.application;

import belajar.programming.data.Avanza;
import belajar.programming.data.Car;

public class CarApp {
    public static void main(String[] args) {

        Car car = new Avanza();
        System.out.println(car.getTire());
        car.drive();
    }
}
