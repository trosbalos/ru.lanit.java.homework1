package zoo.animals;

public class Elk extends Herbivore implements Voice, Swim, Run {


    public Elk(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println("Лось бежит");
    }

    @Override
    public void swim() {
        System.out.println("Лось плывет");
    }

    @Override
    public String voice() {
        return "Лось дает голос";
    }
}
