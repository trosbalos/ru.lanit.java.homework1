package zoo.animals;

import zoo.animals.move.Run;
import zoo.animals.move.Swim;
import zoo.animals.move.Voice;
import zoo.aviary.SizeEnum;

public class Elk extends Herbivore implements Voice, Swim, Run {

    SizeEnum size = SizeEnum.BIG;

    public Elk(String name) {
        super(name);
        sizeEnum = this.size;
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
