import model.Kotik;

public class Application {
    /*
    Создать в корневом каталоге с программой класс Application
    с точкой входа в программу (метод public static void main(String[] args)).
     */
    public static void main(String[] args) {
        Kotik murizik = new Kotik(0, 3, "Murzik", 4, "уоууу");
        Kotik barsik = new Kotik();
        barsik.setKotik(0, 3, "Barsik", 4, "уоууу");
        murizik.liveAnotherDay();

        System.out.println(barsik.getName());
        System.out.println(barsik.getWeight());

        System.out.println(barsik.getMeo().equals(murizik.getMeo()));

        System.out.println(Kotik.getCatsCount());
    }
}
