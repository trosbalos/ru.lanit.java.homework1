package zoo.animals;

import zoo.Exeption.WrongFoodException;
import zoo.food.Food;
import zoo.food.Meat;

public class Carnivorous extends Animal {
    public Carnivorous(String name) {
        super(name);
    }

    @Override
    public void eat(Food food) throws WrongFoodException {
        if (food instanceof Meat) {
            System.out.println(name + " кушает мясо");
        } else throw new WrongFoodException(name + " не кушает траву");

    }

    @Override
    public void swim() {
        System.out.println(name + " плывет");
    }
}
