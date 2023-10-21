package belajar.programming.application;

import belajar.programming.data.Animal;
import belajar.programming.data.Cat;

public class AnimalApp {
    public static void main(String[] args) {

        Animal animal = new Cat();
        animal.name = "Oyen";
        animal.run();
    }
}
