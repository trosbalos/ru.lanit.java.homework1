package zoo.animals;

import zoo.food.Food;
import zoo.food.Grass;
import zoo.food.Meat;

public abstract class Herbivore extends Animal {


    public Herbivore(String name) {
        super(name);
    }

    @Override
    public void eat(Food food) throws WrongFoodException {
        if (food instanceof Grass) {
            System.out.println(name + " кушает траву");
        }
//        else throw new WrongFoodException();
    }

    @Override
    public void swim() {
        System.out.println(name + " плывет");

    }

}
