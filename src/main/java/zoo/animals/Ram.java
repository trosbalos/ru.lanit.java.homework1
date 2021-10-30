package zoo.animals;

public class Ram extends Herbivore implements Run, Voice, Swim {


    public Ram(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println("Баран бежит");
    }

    @Override
    public void swim() {
        System.out.println("Баран плывет");
    }

    @Override
    public String voice() {
        return "Be-e-e";
    }
}
