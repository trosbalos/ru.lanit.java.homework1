package zoo.animals;


public class Cow extends Herbivore implements Voice, Run {


    public Cow(String name) {
        super(name);
    }

    @Override
    public String voice() {
        return "Moo";
    }

    @Override
    public void run() {
        System.out.println("Корова бежит");
    }
}
