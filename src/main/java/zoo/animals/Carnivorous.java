package zoo.animals;

import zoo.food.Food;

public abstract class Carnivorous extends Animal {

    @Override
    public abstract void eat(Food food);

    @Override
    public abstract void swim();
}
