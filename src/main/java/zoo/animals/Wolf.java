package zoo.animals;

import zoo.food.Food;
import zoo.food.Grass;
import zoo.food.Meat;

public class Wolf extends Carnivorous implements Run, Voice, Swim {

    @Override
    public void eat(Food food) {
        if (food instanceof Meat) {
            System.out.println("Волк поел мяса");
        }
        if (food instanceof Grass) {
            System.out.println("Волк траву не ест");
        }
    }


    @Override
    public void run() {
        System.out.println("Волк бежит");
    }

    @Override
    public void swim() {
        System.out.println("Волк плывет");
    }

    @Override
    public String voice() {
        return "Ay-y-y";
    }
}
