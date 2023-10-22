package belajar.programming.application;

public class EqualsApp {
    public static void main(String[] args) {

        String first = "Thomas";
        first = first + " " + "Panji";

        System.out.println(first);

        String second = "Thomas Panji";
        System.out.println(second);

        System.out.println(first == second); // membandingkan apakah dua object yang sama
        System.out.println(first.equals(second));

        String third = "Thomas Panji";
        System.out.println(second == third); // optimisasi di Java, jika isinya sama tidak akan membentuk object baru
        System.out.println(second.equals(third));
    }
}
