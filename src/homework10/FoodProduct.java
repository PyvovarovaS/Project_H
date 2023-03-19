package homework10;

import java.time.LocalDateTime;
class FoodProduct extends Product {
    //constructor
    public FoodProduct(LocalDateTime productionDate, LocalDateTime expiryDate) {
        super(productionDate, expiryDate);
    }

    //method
    public boolean isFood() {
        return true;
    }
}