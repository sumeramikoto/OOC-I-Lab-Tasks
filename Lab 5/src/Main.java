//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Vehicle car = new Car("Sedan", 120, 10);
        Vehicle truck = new Truck("Truck", 80, 80, 5000);
        Vehicle overloadedtruck = new Truck("OverloadedTruck", 80, 80, 5000,2);
        System.out.println("Starting the journey...\n");
        System.out.println("\nInitial status of vehicles:");
        car.displayStatus();
        truck.displayStatus();
        overloadedtruck.displayStatus();
        car.move(20);
        truck.move(30);
        overloadedtruck.move(40);
        truck.speedUp(10);
        car.refuel(40);
        car.move(20);
        overloadedtruck.slowDown(10);
        System.out.println("\nCurrent status of vehicles:");
        car.displayStatus();
        truck.displayStatus();
        overloadedtruck.displayStatus();
    }
}