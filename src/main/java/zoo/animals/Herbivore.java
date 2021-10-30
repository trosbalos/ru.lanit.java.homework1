package zoo.animals;

import zoo.food.Food;
import zoo.food.Grass;
import zoo.food.Meat;

public abstract class Herbivore extends Animal {
    String name;

    public Herbivore(String name) {
        this.name = name;
    }

    @Override
    public void eat(Food food) {
        if (food instanceof Meat) {
            System.out.println(name+" скушало мясо");
        }
        if (food instanceof Grass) {
            System.out.println(name+" не кушает траву");
        }
    }

    @Override
    public abstract void swim();
}
