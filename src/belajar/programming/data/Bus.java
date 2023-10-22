package belajar.programming.data;

public class Bus implements Car {

    public void drive() {
        System.out.println("Bus drive");
    }

    public int getTire() {
        return 8;
    }

    public String getBrand() {
        return "Scania";
    }

    public boolean isMaintenance() {
        return false;
    }

    public boolean isBig() { // override default method dari interface Car
        return true;
    }
}
