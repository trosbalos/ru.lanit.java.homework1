import zoo.animals.*;
import zoo.food.Grass;
import zoo.food.Meat;
import zoo.personal.Worker;

import java.util.ArrayList;

public class Zoo {
    public static void main(String[] args) {

        Cow cow = new Cow();
        Duck duck = new Duck();
        Elk elk = new Elk();
        Fish fish = new Fish();
        Fish fish2 = new Fish();
        Ram ram = new Ram();
        Wolf wolf = new Wolf();
        Grass grass = new Grass();
        Meat meat = new Meat();
        Worker worker = new Worker();

        worker.feed(cow, grass);
        worker.feed(cow, meat);
        worker.feed(duck, grass);
        worker.feed(duck, meat);
        worker.feed(elk, grass);
        worker.feed(elk, meat);
        worker.feed(fish, grass);
        worker.feed(fish, meat);
        worker.feed(ram, grass);
        worker.feed(ram, meat);
        worker.feed(wolf, grass);
        worker.feed(wolf, meat);

        worker.getVoice(cow);
        worker.getVoice(duck);
        worker.getVoice(elk);
        worker.getVoice(ram);
        worker.getVoice(wolf);

        ArrayList<Animal> pool = new ArrayList<>();
        pool.add(fish);
        pool.add(fish2);
        pool.add(duck);
        pool.add(wolf);
        pool.add(elk);
        pool.add(ram);

        for (Animal animal : pool) {
            animal.swim();

        }
    }
}
