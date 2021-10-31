package zoo.animals;

import zoo.food.Food;
import zoo.food.Grass;
import zoo.food.Meat;

public class Carnivorous extends Animal {
    public Carnivorous(String name) {
        super(name);
    }

    @Override
    public void eat(Food food) throws WrongFoodException {
        if (food instanceof Meat) {
            System.out.println(name + " кушает мясо");
        }
//        else throw new WrongFoodException();

    }

    @Override
    public void swim() {
        System.out.println(name + " плывет");
    }
}
