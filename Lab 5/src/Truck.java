public class Truck extends Vehicle {
    private double cargoCapacity;
    private double currentCargo;

    public Truck(String name, double initialSpeed, double initialFuel, double cargoCapacity, double currentCargo) {
        super(name, initialSpeed, initialFuel);
        this.cargoCapacity = cargoCapacity;
        this.currentCargo = currentCargo;
        setFuelConsumptionRate(1.8);
        setSpeedingRate(78);
        setSlowingRate(60);
        if (currentCargo > cargoCapacity) {
            speedingRate -= 10;
            slowingRate += 10;
        }
    }

    public Truck(String name, double initialSpeed, double initialFuel, double cargoCapacity) {
        super(name, initialSpeed, initialFuel);
        this.cargoCapacity = cargoCapacity;
        this.fuelConsumptionRate = 1.8;
        this.speedingRate = 78;
        this.slowingRate = 60;
    }
}
