package zoo.animals;

import zoo.exeption.WrongFoodException;
import zoo.food.Food;
import zoo.food.Grass;

public abstract class Herbivore extends Animal {


    public Herbivore(String name) {
        super(name);
    }

    @Override
    public void eat(Food food) throws WrongFoodException {
        if (food instanceof Grass) {
            System.out.println(getName() + " кушает траву");
        }
       else throw new WrongFoodException(getName() + " не кушает мясо ");
    }

    @Override
    public void swim() {
        System.out.println(getName() + " плывет");

    }

}
