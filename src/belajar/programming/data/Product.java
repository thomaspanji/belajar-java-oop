package belajar.programming.data;

public class Product {
    protected String name;
    protected Integer price;

    public Product(String name, Integer price) {  // set to public so that it can be accessed from other class
        this.name = name;
        this.price = price;
    }

    public String toString() {
        return "Product Name: " + name + ", Price: " + price;
     }
}
