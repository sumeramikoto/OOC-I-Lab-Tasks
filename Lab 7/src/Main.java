public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        Bus bus = new Bus();

        Driver carDriver = new Driver("Charlie", car);
        carDriver.speedUp(150);
        carDriver.turn("Right");
        carDriver.move(2000);
        carDriver.displayStatus();
        Driver busDriver = new Driver("Adib", bus);
        busDriver.move(20);
        busDriver.refuel(1500);
        busDriver.displayStatus();
    }
}