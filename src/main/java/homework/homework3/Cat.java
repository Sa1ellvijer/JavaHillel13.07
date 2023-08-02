package homework.homework3;

public class Cat extends Animal {

    private final String catCreator;

    private static int count;

    public Cat(String catCreator) {
        this.catCreator = catCreator;

        count++;
        System.out.println();
        System.out.println("Cats created :" + count);
    }

    @Override
    public String animalName() {
        return catCreator;
    }

    @Override
    public void run(int runDistance) {
        if (runDistance > 200) {
            System.out.println(runDistance + "M. " + animalName() + " Can't run that much!");

        } else {
            System.out.println("Cat " + animalName() + " ran " + runDistance + "M.");
        }
    }

    @Override
    public void swim(int swimDistance) {
        System.out.println("The cat can't swim");
    }
}