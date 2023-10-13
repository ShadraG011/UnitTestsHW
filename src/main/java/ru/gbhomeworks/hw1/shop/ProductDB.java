package ru.gbhomeworks.hw1.shop;

import java.util.ArrayList;
import java.util.List;

public class ProductDB {
    private List<Product> products;
    private Shop shop;

    {
        products = new ArrayList<>();
        products.add(new Product(50, "water"));
        products.add(new Product(12, "candle"));
        products.add(new Product(300, "chicken"));
        products.add(new Product(600, "cake"));
        products.add(new Product(100, "butter"));
        products.add(new Product(42, "bread"));
    }

    public ProductDB(Shop shop) {
        this.shop = shop;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void addProductsToShop() {
        shop.setProducts(products);
    }
}
