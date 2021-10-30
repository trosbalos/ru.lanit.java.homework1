package zoo.animals;



public class Wolf extends Carnivorous implements Run, Voice, Swim {


    public Wolf(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println("Волк бежит");
    }


    @Override
    public String voice() {
        return "Ay-y-y";
    }
}
