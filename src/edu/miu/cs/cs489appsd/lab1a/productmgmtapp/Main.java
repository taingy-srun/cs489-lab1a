package edu.miu.cs.cs489appsd.lab1a.productmgmtapp;

import edu.miu.cs.cs489appsd.lab1a.productmgmtapp.model.Product;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Product banana = new Product("3128874119", "Banana", LocalDate.parse("2023-01-24"), 124, 0.99);
        Product apple = new Product("2927458265", "Apple", LocalDate.parse("2022-12-09"), 18, 1.99);
        Product carrot = new Product("9189927460", "Carrot", LocalDate.parse("2023-03-31"), 89, 2.99);

        List<Product> products = new ArrayList<>();
        products.add(banana);
        products.add(apple);
        products.add(carrot);
        products.sort(Comparator.comparing(Product::getName));

        ProductManagementApp productManagementApp = new ProductManagementApp();
        productManagementApp.printProducts(products);
    }
}