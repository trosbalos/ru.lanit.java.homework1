package zoo.animals;

import zoo.food.Food;

public abstract class Animal implements Food {
    public String name;


    public Animal(String name) {
        this.name = name;
    }

    public abstract void eat(Food food) throws WrongFoodException;

    public abstract void swim();
}
