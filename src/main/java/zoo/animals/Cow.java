package zoo.animals;

import zoo.food.Food;
import zoo.food.Grass;
import zoo.food.Meat;

public class Cow extends Herbivore implements Voice, Run {

    @Override
    public void eat(Food food) {
        if (food instanceof Meat) {
            System.out.println("Корова масо не кушает");
        }
        if (food instanceof Grass) {
            System.out.println("Корова поела травы");
        }
    }

    @Override
    public void run() {
        System.out.println("Корова бежит");
    }

    @Override
    public String voice() {
        return "Moo";
    }
}
