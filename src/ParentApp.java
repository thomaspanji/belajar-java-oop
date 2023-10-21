public class ParentApp {
    public static void main(String[] args) {

        Child child = new Child();
        child.name = "Thomas";
        child.doIt();
        System.out.println(child.name);

        Parent parent = child; // bisa begini langsung karena child (class Child) merupakan turunan dari Parent
//        Parent parent = (Parent) child;
        parent.doIt(); // bakal akses method dari child, karena objectnya tetap dari class Child
        System.out.println(parent.name); // tapi kalo ini bakal manggil yang parent karena variable hiding, tidak ada istilah variable overriding
    }
}
