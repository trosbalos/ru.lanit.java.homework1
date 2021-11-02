package zoo.animals;

import zoo.animals.move.Swim;
import zoo.aviary.SizeEnum;

public class Fish extends Carnivorous implements Swim {


    SizeEnum size = SizeEnum.SMALL;

    public Fish(String name) {
        super(name);
        sizeEnum = this.size;
    }

}
