package zoo.animals;


import zoo.animals.move.Run;
import zoo.animals.move.Swim;
import zoo.animals.move.Voice;
import zoo.aviary.SizeEnum;

public class Wolf extends Carnivorous implements Run, Voice, Swim {


    SizeEnum size = SizeEnum.MEDIUM;

    public Wolf(String name) {
        super(name);
        sizeEnum = this.size;
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
