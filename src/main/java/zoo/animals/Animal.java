package zoo.animals;

import zoo.food.Food;

public abstract class Animal implements Food {
    public abstract void eat(Food food);

    public abstract void swim();
}
