package zoo.animals;

public class Fish extends Carnivorous implements Swim {


    public Fish(String name) {
        super(name);
    }

    @Override
    public void swim() {
        System.out.println("Рыбка плывет");
    }
}
