public class Ship extends Vehicle {
    private double cargoCapacity;
    private double currentCargo;

    public Ship(String name, double initialSpeed, double initialFuel, double cargoCapacity, double currentCargo) {
        super(name, initialSpeed, initialFuel);
        this.cargoCapacity = cargoCapacity;
        this.currentCargo = currentCargo;
        this.fuelConsumptionRate = 2.1;
        this.speedingRate = 70;
        this.slowingRate = 57;
        if (currentCargo > cargoCapacity) {
            speedingRate -= 10;
            slowingRate += 10;
        }
    }

    public Ship(String name, double initialSpeed, double initialFuel, double cargoCapacity) {
        super(name, initialSpeed, initialFuel);
        this.cargoCapacity = cargoCapacity;
        this.fuelConsumptionRate = 2.1;
        this.speedingRate = 70;
        this.slowingRate = 57;
    }
}
