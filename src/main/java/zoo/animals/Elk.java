package zoo.animals;

import zoo.animals.move.Run;
import zoo.animals.move.Swim;
import zoo.animals.move.Voice;

public class Elk extends Herbivore implements Voice, Swim, Run {


    public Elk(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println("Лось бежит");
    }


    @Override
    public String voice() {
        return "Лось дает голос";
    }
}
