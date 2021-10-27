package zoo.animals;

import zoo.food.Food;
import zoo.food.Grass;
import zoo.food.Meat;

public class Fish extends Carnivorous implements Swim {

    @Override
    public void eat(Food food) {
        if (food instanceof Meat) {
            System.out.println("Рыба поела мяса");
        }
        if (food instanceof Grass) {
            System.out.println("Рыба траву не кушает");
        }
    }

    @Override
    public void swim() {
        System.out.println("Рыбка плывет");
    }
}
