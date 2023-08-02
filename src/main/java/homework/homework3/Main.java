package homework.homework3;

public class Main {

    public static void main(String[] args) {

        // Cat's stats.
        Animal catTom = new Cat ("Tom");
        catTom.run(200);
        catTom.swim(0);

        Animal catSalem = new Cat ("Salem");
        catSalem.run(250);
        catSalem.swim(5);

        // Dog's stats.
        Animal dogRex = new Dog("Rex");
        dogRex.run(500);
        dogRex.swim(10);

        Animal dogBelka = new Dog("Belka");
        dogBelka.run(600);
        dogBelka.swim(25);

        System.out.println();
        System.out.println("Animal created :" + Animal.getCount());

    }
}
