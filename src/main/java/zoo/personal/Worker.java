package zoo.personal;

import zoo.animals.Animal;
import zoo.animals.move.Voice;
import zoo.exeption.WrongFoodException;
import zoo.food.Food;

public class Worker {
    public void feed(Animal animal, Food food) throws WrongFoodException {
        animal.eat(food);
    }

    public void getVoice(Voice animal) {
        animal.voice();

    }
}

