package zoo.animals;

import zoo.aviary.SizeEnum;
import zoo.exeption.WrongFoodException;
import zoo.food.Food;

public abstract class Animal implements Food {
    private String name;
     SizeEnum sizeEnum;



    public Animal(String name) {
        this.name = name;
    }

    public abstract void eat(Food food) throws WrongFoodException;

    public abstract void swim();
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SizeEnum getSizeEnum() {
        return sizeEnum;
    }
}
