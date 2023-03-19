package homework10;

import java.time.LocalDateTime;

class ProductFactory {
    //static fields
    private static int foodProductsCount;
    private static int nonFoodProductsCount;

    //constructors
    public static Product createFoodProduct(LocalDateTime productionDate, LocalDateTime expiryDate) {
        foodProductsCount++;
        return new FoodProduct(productionDate, expiryDate);
    }
    public static Product createNonFoodProduct(LocalDateTime productionDate, LocalDateTime expiryDate) {
        nonFoodProductsCount++;
        return new NonFoodProduct(productionDate, expiryDate);
    }

    //getters
    public static int getFoodProductsCount() {
        return foodProductsCount;
    }
    public static int getNonFoodProductsCount() {
        return nonFoodProductsCount;
    }
    public static int getTotalFoodProductsCount() {
        return foodProductsCount;
    }
    public static int getTotalNonFoodProductsCount() {
        return nonFoodProductsCount;
    }
}