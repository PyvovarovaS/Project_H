package homework10;

import java.time.LocalDateTime;

class Product {
    private LocalDateTime productionDate;
    private LocalDateTime expiryDate;

    //static fields
    private static int foodCount = 0;
    private static int nonFoodCount = 0;

    //constructor
    public Product(LocalDateTime productionDate, LocalDateTime expiryDate) {
        this.productionDate = productionDate;
        this.expiryDate = expiryDate;
    }
    public Product(String name, boolean isFood) {
        if (isFood) {
            foodCount++;
        } else {
            nonFoodCount++;
        }
    }

    //methods
    public boolean isExpired() {
        return LocalDateTime.now().isAfter(expiryDate);
    }

    //getters
    public LocalDateTime getProductionDate() {
        return productionDate;
    }
    public LocalDateTime getExpiryDate() {
        return expiryDate;
    }
    public static int getFoodCount() {
        return foodCount;
    }
    public static int getNonFoodCount() {
        return nonFoodCount;
    }
}