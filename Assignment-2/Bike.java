public class Bike extends Vehicle {

    @Override
    public void start() {
        System.out.println("Bike starts with a self-start button.");
    }

    @Override
    public void stop() {
        System.out.println("Bike stops using brakes.");
    }
}
