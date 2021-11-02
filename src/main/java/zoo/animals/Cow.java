package zoo.animals;


import zoo.animals.move.Run;
import zoo.animals.move.Voice;
import zoo.aviary.SizeEnum;

public class Cow extends Herbivore implements Voice, Run {

    SizeEnum size = SizeEnum.LARGE;

    public Cow(String name) {
        super(name);
        sizeEnum = this.size;
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
