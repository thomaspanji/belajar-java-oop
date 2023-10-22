package belajar.programming.data;

public interface Car extends HasBrand, IsMaintenance {

//    public abstract void drive(); // tidak perlu karena sudah default ke public abstract
    void drive();
    int getTire();

    default boolean isBig() { // concrete method pada interface, kelas yang implementasi Car tidak perlu tulis lagi
        return false;
    }
}
