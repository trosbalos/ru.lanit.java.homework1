package zoo.Aviary;

import zoo.animals.Animal;

import java.util.HashMap;
import java.util.Objects;
/*
Задание:
Создать обобщенный (generic) класс вольера для животных из предыдущего здания. Должна быть возможность создавать
 вольеры отдельно для хищников и травоядных.

Добавьте перечисление описывающие варианты размера вольера с четырьмя перечислимыми константами.
Потом добавьте в класс животного параметр, отвечающий за необходимый для него размер вольера и в сам
 класс вольера добавьте поля обозначающее его размер. Добавьте проверку, при помещении животного в вольер,
 что его размер подходит для этого животного.
*/

public class Aviary<T> {
    public int aviaryMapSize = 0;
    private final HashMap<Integer, T> aviary = new HashMap<Integer, T>();
    int aviarySize = 100;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aviary<?> aviary1 = (Aviary<?>) o;
        return aviaryMapSize == aviary1.aviaryMapSize &&
                aviarySize == aviary1.aviarySize &&
                Objects.equals(aviary, aviary1.aviary);
    }

    @Override
    public int hashCode() {
        return Objects.hash(aviaryMapSize, aviary, aviarySize);
    }

    public void addAnimalToCarnivorous(T animal, int animalSize) {
        if (aviarySize >= animalSize) {
            aviarySize -= animalSize;
            aviary.put(aviaryMapSize, animal);
            aviaryMapSize++;
        }
    }

    public void addAnimalToHerbivore(T animal, int animalSize) {
        if (aviarySize >= animalSize) {
            aviarySize -= animalSize;
            aviary.put(aviaryMapSize, animal);
            aviaryMapSize++;
        }
    }

    public void removeAnimal(String string, int animalSize) {
        for (Integer key : aviary.keySet()) {
            Animal value = (Animal) aviary.get(key);
            if (value.name.equals(string)) {
                aviary.remove(key);
                aviarySize += animalSize;

                break;

            }
        }

    }

    public Animal getAnimal(String string) {
        for (Integer key : aviary.keySet()) {
            Animal value = (Animal) aviary.get(key);
            if (string.equals(value.name)) {
                return value;
            }
        }
        return null;
    }

    public void printAnimals() {
        for (Integer key : aviary.keySet()) {
            Animal value = (Animal) aviary.get(key);
            System.out.println(key + " --> " + value.name);
        }
    }

}
