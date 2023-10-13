package ru.gbhomeworks.hw1.shop;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class ComparatorCostSort implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        return Integer.compare(o1.getCost(), o2.getCost());
    }
}

class ComparatorGetMostExpensiveProduct implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        if (o1.getCost() < o2.getCost())
            return -1; // highest value first
        if (o1.getCost() == o2.getCost())
            return 0;
        return 1;
    }

}

public class Shop {
    private List<Product> products;
    private ComparatorCostSort comparator = new ComparatorCostSort();

    // Геттеры, сеттеры:
    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    // Метод должен вернуть отсортированный по возрастанию по цене список продуктов
    public List<Product> sortProductsByPrice() {
        products.sort(comparator);
        return products;
    }

    // Метод должен вернуть самый дорогой продукт
    public Product getMostExpensiveProduct() {
        return Collections.max(products, new ComparatorGetMostExpensiveProduct());
    }

    public ComparatorCostSort getComparator() {
        return comparator;
    }
}


