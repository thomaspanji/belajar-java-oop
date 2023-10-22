package belajar.programming.data;

public class ProductApp {
    public static void main(String[] args) {

        Product product = new Product("MacBook Pro", 22000000);

        System.out.println(product.name);
        System.out.println(product.price);

        System.out.println(product); // kalo tidak dioverride akan menghasilkan class@hashcode
    }
}
