package homework10;

import java.time.LocalDateTime;
class NonFoodProduct extends Product {
    //constructor
    public NonFoodProduct(LocalDateTime productionDate, LocalDateTime expiryDate) {
        super(productionDate, expiryDate);
    }

    //method
    public boolean isFood() {
        return false;
    }
}