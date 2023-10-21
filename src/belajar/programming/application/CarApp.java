package belajar.programming.application;

import belajar.programming.data.Avanza;
import belajar.programming.data.Car;

public class CarApp {
    public static void main(String[] args) {

        Car car = new Avanza();  // object Avanza tapi di-define Car
        System.out.println(car.getTire());
        car.drive();
        System.out.println(car.isMaintenance()); // error jika di-define di class Car tapi implement di Avanza.
    }
}
