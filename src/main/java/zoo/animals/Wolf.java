package zoo.animals;


import zoo.animals.move.Run;
import zoo.animals.move.Swim;
import zoo.animals.move.Voice;

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
