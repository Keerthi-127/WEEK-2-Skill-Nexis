public class VehicleDemo {

    public static void main(String[] args) {

        Vehicle car = new Car();
        Vehicle bike = new Bike();

        System.out.println("----- CAR -----");
        car.start();
        car.stop();

        System.out.println();

        System.out.println("----- BIKE -----");
        bike.start();
        bike.stop();
    }
}
