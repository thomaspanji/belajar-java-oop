package belajar.programming.data;

public interface Car extends HasBrand, IsMaintenance {

//    public abstract void drive(); // tidak perlu karena sudah default ke public abstract
    void drive();
    int getTire();
}
