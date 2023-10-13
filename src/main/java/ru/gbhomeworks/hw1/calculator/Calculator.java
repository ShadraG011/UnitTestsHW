package ru.gbhomeworks.hw1.calculator;

import static org.assertj.core.api.Assertions.*;

public class Calculator {

    public static void main(String[] args) {

       System.out.println(calculatingDiscount(10000, 1));
    }

    public static int calculation(int firstOperand, int secondOperand, char operator) {
        int result;

        switch (operator) {
            case '+':
                result = firstOperand + secondOperand;
                break;
            case '-':
                result = firstOperand - secondOperand;
                break;
            case '*':
                result = firstOperand * secondOperand;
                break;
            case '/':
                if (secondOperand != 0) {
                    result = firstOperand / secondOperand;
                    break;
                } else {
                    throw new ArithmeticException("Division by zero is not possible");
                }
            default:
                throw new IllegalStateException("Unexpected value operator: " + operator);
        }
        return result;
    }

    // HW1.1: Придумайте и опишите (можно в псевдокоде) функцию извлечения корня и
    // необходимые проверки для него используя граничные случаи
    public static double squareRootExtraction(double num) {
        if (num <= 0) {
            throw new IllegalArgumentException("Cannot calculate square root of a negative number, a zero");
        }

        double t;
        double squareRoot = num / 2;
        do {
            t = squareRoot;
            squareRoot = (t + (num / t)) / 2;
        } while ((t - squareRoot) != 0);
        return squareRoot;
    }

    // Нужно написать в калькуляторе метод вычисления суммы покупки со скидкой и проверить его, используя AssertJ
    // Примерная сигнатура и тело метода:
    public static double calculatingDiscount(double purchaseAmount, int discountAmount) {
        // purchaseAmount - сумма покупки
        // discountAmount - размер скидки
        assertThat(purchaseAmount).isGreaterThan(0);
        assertThat(discountAmount).isGreaterThan(0).isLessThan(100);

        purchaseAmount = purchaseAmount - (purchaseAmount * ((double) discountAmount / 100));

        return purchaseAmount; // Метод должен возвращать сумму покупки со скидкой
    }
}