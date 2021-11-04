package zoo.aviary;

import zoo.animals.Animal;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;


public class Aviary<T extends Animal> {

    private SizeEnum size;

    public Aviary(SizeEnum size) {
        this.size = size;
    }

    private final Map<String, T> aviary = new HashMap<>();

    public void addAnimal(String name, T animal) {

        if (animal.getSizeEnum() == size) {
            aviary.put(name, animal);
        }
        else System.out.println(animal.getName() +" не влезает в вольер размером : "+ size);
    }





    public void removeAnimal(String string) {
        for (String key : aviary.keySet()) {
            Animal value = aviary.get(key);
            if (value.getName().equals(string)) {
                aviary.remove(key);
                System.out.println("Удалили : " + value);
                System.out.println("--------------------");
                aviary.remove(key);
                break;
            }
        }
    }

    public Animal getAnimal(String string) {
        for (String key : aviary.keySet()) {
            Animal value = aviary.get(key);
            if (string.equals(value.getName())) {
                System.out.println("Взяли животное : " + value);
                System.out.println("--------------------");
                return value;
            }
        }
        return null;
    }


    public void printAnimals() {
        for (String key : aviary.keySet()) {
            Animal value = aviary.get(key);
            System.out.println(key + " --> " + value);
        }
        System.out.println("--------------------");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aviary<?> aviary = (Aviary<?>) o;
        return size == aviary.size &&
                Objects.equals(this.aviary, aviary.aviary);
    }

    @Override
    public int hashCode() {
        return Objects.hash(size, aviary);
    }
}
