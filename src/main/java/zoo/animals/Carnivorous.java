package zoo.animals;
import zoo.food.Food;
import zoo.food.Grass;
import zoo.food.Meat;


public abstract class Carnivorous extends Animal implements Food {
String name;

    public Carnivorous(String name) {
        this.name = name;
    }

    @Override
    public void eat(Food food) {
        if (food instanceof Meat) {
            System.out.println(name+" скушало мясо");
        }
        if (food instanceof Grass) {
            System.out.println(name+" не кушает траву");
        }
    }
}
