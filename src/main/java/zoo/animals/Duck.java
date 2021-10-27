package zoo.animals;

import zoo.food.Food;
import zoo.food.Grass;
import zoo.food.Meat;

public class Duck extends Carnivorous implements Voice, Swim, Run, Fly {
    @Override
    public void eat(Food food) {
        if (food instanceof Meat) {
            System.out.println("Утка скушала мясо");
        }
        if (food instanceof Grass) {
            System.out.println("Утка не кушает траву");
        }
    }

    @Override
    public void fly() {
        System.out.println("Утка лежит");
    }

    @Override
    public void run() {
        System.out.println("Утка бежит");
    }

    @Override
    public void swim() {
        System.out.println("Утка плывет");
    }

    @Override
    public String voice() {
        return "Krya-krya";
    }
}
