package homework10;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        Product product1 = new Product("Chips",true);
        Product product2 = new Product("Nuggets", true);
        Product product3 = new Product("Phone", false);
        Product product4 = new Product("Microwave", false);

        Product bread = ProductFactory.createFoodProduct(LocalDateTime.of(2023, 3, 19,
                10, 30), LocalDateTime.of(2023, 3, 22, 10, 30));
        Product bagel = ProductFactory.createFoodProduct(LocalDateTime.of(2023, 3, 19,
                10, 30), LocalDateTime.of(2023, 3, 30, 10, 30));
        Product cookies = ProductFactory.createFoodProduct(LocalDateTime.of(2023, 3, 19,
                10, 30), LocalDateTime.of(2023, 4, 19, 10, 30));
        Product tv = ProductFactory.createNonFoodProduct(LocalDateTime.of(2023, 3, 19,
                10, 30), LocalDateTime.of(2024, 3, 19, 10, 30));
        Product fridge = ProductFactory.createNonFoodProduct(LocalDateTime.of(2023, 3, 19,
                10, 30), LocalDateTime.of(2025, 3, 19, 10, 30));

        System.out.println("Фабрика виготовила " + ProductFactory.getFoodProductsCount()
                + " продуктових товарів");
        System.out.println("Фабрика виготовила " + ProductFactory.getNonFoodProductsCount()
                + " непродуктових товарів");
        System.out.println("Загалом створено " + (ProductFactory.getTotalFoodProductsCount()+Product.getFoodCount())
                + " продуктових товарів");
        System.out.println("Загалом створено "
                + (ProductFactory.getTotalNonFoodProductsCount()+Product.getNonFoodCount())
                + " непродуктових товарів");
    }
}