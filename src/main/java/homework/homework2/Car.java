package homework.homework2;

public class Car {

    public void start() {

        startElectricity();
        startCommand();
        startFuelSystem();

    }

    private void startElectricity() {
        System.out.println("Staring Electricity.");
    }

    private void startCommand() {
        System.out.println("Starting Command.");
    }

    private void startFuelSystem() {
        System.out.println("Starting Fuel System.");
    }

    public static void main(String[] args) {
        Car car = new Car();
        car.start();

    }

}

