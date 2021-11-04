import zoo.animals.*;
import zoo.aviary.Aviary;
import zoo.aviary.SizeEnum;
import zoo.exeption.WrongFoodException;
import zoo.food.Grass;
import zoo.food.Meat;
import zoo.personal.Worker;

import java.util.ArrayList;

public class Zoo {
    public static void main(String[] args) throws WrongFoodException {

        Cow cow = new Cow("Корова Дуся");
        Duck duck = new Duck("Утка Вася");
        Elk elk = new Elk("Лось Анатолий");
        Fish fish = new Fish("Рыба Коля");
        Fish fish2 = new Fish("Рыба Кит");
        Ram ram = new Ram("Баран Илья");
        Wolf wolf = new Wolf("Волк Петр");
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
        System.out.println("----------------");

        Aviary<Carnivorous> avi1 = new Aviary<>(SizeEnum.SMALL);
        avi1.addAnimal(fish2.getName(), fish2);
        avi1.addAnimal(fish.getName(), fish);
        avi1.printAnimals();
        avi1.removeAnimal(fish2.getName());
        avi1.printAnimals();

        Aviary<Carnivorous> avi2 = new Aviary<>(SizeEnum.MEDIUM);
        avi2.addAnimal(wolf.getName(), wolf);
        avi2.addAnimal(fish.getName(), fish);
        avi2.addAnimal(duck.getName(), duck);
        avi2.printAnimals();
        avi2.getAnimal(wolf.getName());


        Aviary<Herbivore> avi3 = new Aviary<>(SizeEnum.LARGE);
        avi3.addAnimal("Корова Дуся", cow);
        avi3.addAnimal("Лось Анатолий", elk);
        avi3.printAnimals();


        Aviary<Herbivore> avi4 = new Aviary<>(SizeEnum.MEDIUM);
//        avi4.addAnimal(wolf.getName(), wolf);
        avi4.addAnimal(ram.getName(), ram);
        avi4.printAnimals();



    }
}
