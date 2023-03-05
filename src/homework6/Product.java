package homework6;

public class Product {
    // fields
    private String title;
    private final int itemNumber;
    private double price;
    private String description;
    private boolean available;

    // constructor
    public Product(String model, int id, double price, String description, boolean available){
        title = model;
        itemNumber = id;
        this.price = price;
        this.description = description;
        this.available = available;
    }
    public Product(String model, int id, double price, String description){
        title = model;
        itemNumber = id;
        this.price = price;
        this.description = description;
    }

    // methods
    public void setPrice(){
        if (available) {
            this.price = price;
        } else {
            this.price = 0;
        }
    }

    // getters
    public String getTitle(){
        return title;
    }
    public int getItemNumber(){
        return itemNumber;
    }
    public double getPrice(){
        return price;
    }
    public String getDescription(){
        return description;
    }
    public boolean isAvailable(){
        return available;
    }

    // setters
    public void setTitle(String model){
        title = model;
    }
    public void setDescription(String parameters){
        description = parameters;
    }
    public void setPrice(double price){
        this.price = price;
    }
    public void setAvailable(boolean available){
        this.available = available;
    }
}
