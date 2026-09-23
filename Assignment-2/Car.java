public class Car extends Vehicle {

    @Override
    public void start() {
        System.out.println("Car starts with a key.");
    }

    @Override
    public void stop() {
        System.out.println("Car stops using brakes.");
    }
}
