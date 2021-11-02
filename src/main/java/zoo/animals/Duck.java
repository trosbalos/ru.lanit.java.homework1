package zoo.animals;

import zoo.animals.move.Fly;
import zoo.animals.move.Run;
import zoo.animals.move.Swim;
import zoo.animals.move.Voice;
import zoo.aviary.SizeEnum;

public class Duck extends Carnivorous implements Voice, Swim, Run, Fly {

    SizeEnum size = SizeEnum.SMALL;

    public Duck(String name) {
        super(name);
        sizeEnum = this.size;
    }

    @Override
    public void fly() {
        System.out.println("Утка лежит");
    }

    @Override
    public void run() {
        System.out.println("Утка бежит");
    }


    @Override
    public String voice() {
        return "Krya-krya";
    }
}
