package ru.gbhomeworks.hw1.shop;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        Shop shop = new Shop();
        ProductDB productDB = new ProductDB(shop);
        ShopTest shopTest = new ShopTest(shop, productDB);
        List<Product> falseProductsList = new ArrayList<>();

        //region Проверка на соответствие списка продуктов поступивших в магазин

//        //Тест на проверку наличия продуктов в магазине (магазин не пуст)
//        shopTest.testRightQuantityProducts(); // тест не пройдет
//
//
//        /*Проверка на соответствие размера списка продуктов в магазине
//        (правильный список продуктов отправляется из базы данных (класс ProductDB))
//        */
//        falseProductsList.add(new Product(50, "FalseWater"));
//        falseProductsList.add(new Product(12, "FalseCandle"));
//        falseProductsList.add(new Product(300, "FalseChicken"));
//        shop.setProducts(falseProductsList);
//        shopTest.testRightQuantityProducts(); // тест не пройдет
//
//
//        /*
//        Проверка на то, что список продуктов поступивший в магазин соответствует
//        списку продуктов находящемуся в базе данных (класс ProductDB)
//        */
//        falseProductsList.add(new Product(50, "FalseWater"));
//        falseProductsList.add(new Product(12, "FalseCandle"));
//        falseProductsList.add(new Product(300, "FalseChicken"));
//        falseProductsList.add(new Product(600, "FalseCake"));
//        falseProductsList.add(new Product(100, "FalseButter"));
//        falseProductsList.add(new Product(42, "FalseBread"));
//        shop.setProducts(falseProductsList);
//        shopTest.testRightQuantityProducts(); // тест не пройдет
//
//
//        /*
//        Необходимое условие для прохождения первого теста
//        */
//        productDB.addProductsToShop();
//        shopTest.testRightQuantityProducts(); // тест пройдет
        //endregion


        //region Проверка на то, что список продуктов в магазине отсортирован

//        productDB.addProductsToShop();
//
//        shopTest.testSortProductsByPrice(); // тест не пройдет
//
//        //Производится сортировка
//        shop.sortProductsByPrice();
//        shopTest.testSortProductsByPrice(); // тест пройдет

        //endregion


        //region Проверка на то, что метод getMostExpensiveProduct возвращает продукт наибольшей стоимости

//        productDB.addProductsToShop();
//        // тест пройдет
//        // (для проверки того, что тест не пройдет можно изменить логику метода compare в классе ComparatorGetMostExpensiveProduct)
//        shopTest.testGetMostExpensiveProduct();

        //endregion
    }
}
