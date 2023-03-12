package homework8.animal.Pets;

import homework8.animal.Animal;

//створюємо клас ссавців, що годують дитинчат молоком.
public abstract class Mammal extends Animal {
    //field
    private String furColor;

    //constructor
    public Mammal(String name, int age, String furColor) {
        super(name, age);
        this.furColor = furColor;
    }
    //methods
    public void feedMilk() {
    }

    //getter
    public String getFurColor() {
        return furColor;
    }
}