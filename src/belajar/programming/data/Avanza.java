package belajar.programming.data;

//public class Avanza implements Car, IsMaintenance { // Car tidak implement IsMaintenance
public class Avanza implements Car {

    public void drive() {
        System.out.println("Avanza drives");
    }

    public int getTire() {
        return 4;
    }

    public String getBrand() {
        return "Toyota";
    }

    public boolean isMaintenance() {
        return false;
    }
}
