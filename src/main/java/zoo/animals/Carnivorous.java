package zoo.animals;

import zoo.aviary.SizeEnum;
import zoo.exeption.WrongFoodException;
import zoo.food.Food;
import zoo.food.Meat;

public class Carnivorous extends Animal {


    public Carnivorous(String name) {
        super(name);
    }

    @Override
    public void eat(Food food) throws WrongFoodException {
        if (food instanceof Meat) {
            System.out.println(getName() + " кушает мясо");
        }
//        else throw new WrongFoodException(name + " не кушает траву");

    }

    @Override
    public void swim() {
        System.out.println(getName() + " плывет");
    }
}
