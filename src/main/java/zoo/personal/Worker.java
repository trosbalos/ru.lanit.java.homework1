package zoo.personal;

import zoo.animals.Animal;
import zoo.animals.Voice;
import zoo.food.Food;

public class Worker {
    public void feed(Animal animal, Food food) {
        animal.eat(food);
    }

    public void getVoice(Animal animal) {
        try {
            System.out.println(((Voice) animal).voice());
        } catch (ClassCastException e) {
            System.out.println(e.getMessage());
        }

    }
}

