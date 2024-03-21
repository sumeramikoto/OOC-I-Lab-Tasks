public class Driver {
    private String name;
    private Vehicle vehicle;

    public Driver(String name, Vehicle vehicle) {
        this.name = name;
        this.vehicle = vehicle;
    }

    public void move(double distance) {
        vehicle.move(distance);
    }

    public void turn(String direction) {
        vehicle.turn(direction);
    }

    public void speedUp(double amount) {
        vehicle.speedUp(amount);
    }

    public void slowDown(double amount) {
        vehicle.slowDown(amount);
    }

    public void refuel(double amount) {
        vehicle.refuel(amount);
    }

    public void displayStatus() {
        System.out.println("Driver name - " + name);
        System.out.println("Displaying status of " + name + "'s vehicle...");
        vehicle.displayStatus();
    }
}
