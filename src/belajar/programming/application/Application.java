package belajar.programming.application;

import belajar.programming.data.Product;  // hanya bisa import public class, set bukan public untuk class yang dipake internal
//import belajar.programming.data.*; untuk import semua public class

public class Application {
    public static void main(String[] args) {

        Product product = new Product("MacBook Air",15000000);
//        System.out.println(product.name); // tidak bisa diakses karena beda package, harus ubah name menjadi public di class Product
    }
}
