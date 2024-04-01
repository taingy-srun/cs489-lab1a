package edu.miu.cs.cs489appsd.lab1a.productmgmtapp;

import edu.miu.cs.cs489appsd.lab1a.productmgmtapp.model.Product;

import java.util.List;

public class ProductManagementApp {

    public void printProducts(List<Product> products) {
        printProductsInJsonFormat(products);
        System.out.println("-----------------------------------");
        printProductsInXMLFormat(products);
        System.out.println("-----------------------------------");
        printProductsInCSVFormat(products);
    }

    private void printProductsInCSVFormat(List<Product> products) {
        System.out.println("Printed in Comma-Separated Value(CSV) Format");
        products.forEach(product -> {
            System.out.println(product.toCSV());
        });
    }

    private void printProductsInXMLFormat(List<Product> products) {
        System.out.println("Printed in XML Format");
        System.out.println("<?xml version=\"1.0\"?>");
        System.out.println("<products>");
        products.forEach(product -> {
            System.out.println("\t" + product.toXML());
        });
        System.out.println("</products>");
    }

    private void printProductsInJsonFormat(List<Product> products) {
        System.out.println("Printed in JSON Format \n[");
        products.forEach(product -> {
            System.out.println("\t" + product.toJSON());
        });
        System.out.println("]");
    }
}

