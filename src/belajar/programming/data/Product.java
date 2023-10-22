package belajar.programming.data;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Product product = (Product) o;

        if (!Objects.equals(name, product.name)) return false;
        return price.equals(product.price);
    }

}
