package zoo.animals;

import zoo.food.Food;
import zoo.food.Grass;
import zoo.food.Meat;

public class Ram extends Herbivore implements Run, Voice, Swim {

    @Override
    public void eat(Food food) {
        if (food instanceof Meat) {
            System.out.println("Баран масо не кушает");
        }
        if (food instanceof Grass) {
            System.out.println("Баран поел травы");
        }
    }

    @Override
    public void run() {
        System.out.println("Баран бежит");
    }

    @Override
    public void swim() {
        System.out.println("Баран плывет");
    }

    @Override
    public String voice() {
        return "Be-e-e";
    }
}
