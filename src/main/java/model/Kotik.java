package model;

public class Kotik {

    private int food = 0;
    private int prettiness;
    private String name;
    private int weight;
    private String meo;


    private static int catsCount = 0;


    public boolean play() {

        if (food > 0) {
            System.out.println("поиграл");
            food--;
        }
        return true;
    }

    public boolean sleep() {

        if (food > 0) {
            System.out.println("поспал");
            food--;
        }
        return true;
    }

    public boolean meow() {

        if (food > 0) {
            System.out.println("мяукнул");
            food--;
        }
        return true;
    }

    public boolean eat(int food) {
        this.food = food;
        return true;
    }

    public boolean eat(int x, String foodName) {
        this.food += x;
        System.out.println("поел " + x + " " + foodName);
        return true;
    }

    public boolean eat() {
        eat(4, "колбаски");
        return true;
    }

    public boolean isHungry() {

        if (food <= 0) {
            System.out.println("голодный");
            return false;
        }
        return true;
    }

    public boolean jump() {

        if (food > 0) {
            System.out.println("прыгнул");
            food--;
        }
        return true;
    }

    public boolean run() {

        if (food > 0) {
            System.out.println("побегал");
            food--;
        }
        return true;
    }

    public Kotik() {
        catsCount++;
    }

    public Kotik(int food, int prettiness, String name, int weight, String meo) {
        this.food = food;
        this.prettiness = prettiness;
        this.name = name;
        this.weight = weight;
        this.meo = meo;
        catsCount++;
    }

    public void setKotik(int food, int prettiness, String name, int weight, String meo) {
        this.food = food;
        this.prettiness = prettiness;
        this.name = name;
        this.weight = weight;
        this.meo = meo;

    }

    public void liveAnotherDay() {
        for (int i = 0; i < 24; i++) {
            if (isHungry()) {
                int n = (int) (Math.random() * 5);
                switch (n) {
                    case 1:
                        play();
                        break;
                    case 2:
                        sleep();
                        break;
                    case 3:
                        jump();
                        break;
                    case 4:
                        meow();
                        break;
                    case 5:
                        run();
                        break;

                }
            } else eat(5, "сосисок");
        }

    }

    public int getFood() {
        return food;
    }

    public int getPrettiness() {
        return prettiness;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public String getMeo() {
        return meo;
    }

    public static int getCatsCount() {
        return catsCount;
    }
}
