package zoo.animals;

import zoo.animals.move.Run;
import zoo.animals.move.Swim;
import zoo.animals.move.Voice;
import zoo.aviary.SizeEnum;

public class Ram extends Herbivore implements Run, Voice, Swim {


    SizeEnum size = SizeEnum.MEDIUM;

    public Ram(String name) {
        super(name);
        sizeEnum = this.size;
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
