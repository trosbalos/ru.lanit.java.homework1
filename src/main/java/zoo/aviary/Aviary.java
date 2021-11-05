package zoo.aviary;

import zoo.animals.Animal;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Aviary<T extends Animal> {

    private final SizeEnum size;
    private final Map<String, T> aviary = new HashMap<>();

    public Aviary(SizeEnum size) {
        this.size = size;
    }

    public void addAnimal(String name, T animal) {
        if (animal.getSizeEnum() == size) aviary.put(name, animal);
        else System.out.println(animal.getName() + " не влезает в вольер размером : " + size);
    }

    public void removeAnimal(String string) {
        aviary.remove(string);
    }

    public T getAnimal(String string) {
        return aviary.remove(string);
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
