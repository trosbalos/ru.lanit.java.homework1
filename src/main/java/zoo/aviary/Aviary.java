package zoo.aviary;

import zoo.animals.Animal;

import java.util.HashMap;
import java.util.Objects;


public class Aviary<T extends Animal> {

    private SizeEnum size;

    private final HashMap<String, T> aviary = new HashMap<String, T>();

    public void addAnimal(String name, Animal animal) {

        if (aviary.size() == 0) {
            aviary.put(name, (T) animal);
            size = animal.getSizeEnum();
        }
        if (aviary.size() > 0 && animal.getSizeEnum() == size) {
            for (String t : aviary.keySet()) {
                Animal value = aviary.get(t);
                if (value.getClass() == animal.getClass()) {
                    aviary.put(name, (T) animal);
                } else System.out.println("Животные разных типов не могет жить в одном вольере");
                break;
            }
        }
        if (animal.getSizeEnum() != size) System.out.println("Вольер только для животных размера: " + size);

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
