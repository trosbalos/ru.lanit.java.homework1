package zoo.animals;

public class Duck extends Carnivorous implements Voice, Swim, Run, Fly {


    public Duck(String name) {
        super(name);
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
