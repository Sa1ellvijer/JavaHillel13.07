package homework.homework3;

public abstract class Animal {

    private static int count;

    public Animal () {
        count++;
    }

    public void run (int runDistance) {
        System.out.println(" was ran " + runDistance + "m.");
    }

    public void swim (int swimDistance) {
        System.out.println(" was swam " + swimDistance + "m.");
    }

    public static int getCount() {
        return count;
    }

    public abstract String animalName();
}
