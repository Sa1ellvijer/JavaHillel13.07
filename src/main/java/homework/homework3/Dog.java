package homework.homework3;

public class Dog extends Animal {

    private final String dogCreator;

    private static int count;

    public Dog(String dogCreator) {
        this.dogCreator = dogCreator;
        count++;
        System.out.println();
        System.out.println("Dogs created :" + count);
    }

    @Override
    public String animalName() {
        return dogCreator;
    }

    @Override
    public void run(int runDistance) {
        if (runDistance > 500) {
            System.out.println(runDistance + "M. " + animalName() + " Can't run that much!");

        } else {
            System.out.println("The Dog " + animalName() + " ran " + runDistance + "M.");
        }
    }

    @Override
    public void swim(int swimDistance) {
        if (swimDistance > 10) {
            System.out.println(swimDistance + " Can't swim that much!");
        } else {
            System.out.println("The Dog " + animalName() + " swam " + swimDistance + "M.");
        }
    }
}
