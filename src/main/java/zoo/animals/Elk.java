package zoo.animals;

import zoo.food.Food;
import zoo.food.Grass;
import zoo.food.Meat;

public class Elk extends Herbivore implements Voice, Swim, Run {

    @Override
    public void eat(Food food) {
        if (food instanceof Meat) {
            System.out.println("Лось масо не кушает");
        }
        if (food instanceof Grass) {
            System.out.println("Лось поел травы");
        }
    }

    @Override
    public void run() {
        System.out.println("Лось бежит");
    }

    @Override
    public void swim() {
        System.out.println("Лось плывет");
    }

    @Override
    public String voice() {
        return "Лось дает голос";
    }
}
