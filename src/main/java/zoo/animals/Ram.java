package zoo.animals;

import zoo.animals.move.Run;
import zoo.animals.move.Swim;
import zoo.animals.move.Voice;

public class Ram extends Herbivore implements Run, Voice, Swim {


    public Ram(String name) {
        super(name);
    }


    @Override
    public void run() {
        System.out.println("Баран бежит");
    }


    @Override
    public String voice() {
        return "Be-e-e";
    }
}
