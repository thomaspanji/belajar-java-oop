package belajar.programming.application;

import belajar.programming.data.City;
import belajar.programming.data.Location;

public class LocationApp {
    public static void main(String[] args) {

//        var location = new Location(); // tidak bisa, karena Location merupakan abstract class
        var city = new City();
        city.name = "Jakarta";

        System.out.println(city.name);

    }
}
