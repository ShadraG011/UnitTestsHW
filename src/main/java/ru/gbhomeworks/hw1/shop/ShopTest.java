package ru.gbhomeworks.hw1.shop;

import java.util.Comparator;
import java.util.List;

import static org.assertj.core.api.Assertions.*;

public class ShopTest {

    private Shop shop;
    private ProductDB productDB;

    public ShopTest(Shop shop, ProductDB productDB) {
        this.shop = shop;
        this.productDB = productDB;
    }

    /*
       1. Напишите тесты, чтобы проверить, что магазин хранит верный список продуктов (правильное количество продуктов, верное содержимое корзины).
       2. Напишите тесты для проверки корректности работы метода getMostExpensiveProduct.
       3. Напишите тесты для проверки корректности работы метода sortProductsByPrice (проверьте правильность сортировки).
       */

    public void testRightQuantityProducts(){
        assertThat(shop.getProducts())
                .isNotEmpty()
                .hasSize(productDB.getProducts().size())
                .isEqualTo(productDB.getProducts());
    }
    public void testSortProductsByPrice() {
        assertThat(shop.getProducts())
                .isNotEmpty()
                .isSortedAccordingTo(shop.getComparator());
    }

    public void testGetMostExpensiveProduct() {
        assertThat(shop.getMostExpensiveProduct().getCost())
                .isEqualTo(shop.sortProductsByPrice().get(shop.getProducts().size()-1).getCost());
    }

    public void takeTests() {
        testRightQuantityProducts();
        testSortProductsByPrice();
        testGetMostExpensiveProduct();
        System.out.println("Все тесты пройдены!");
    }

}