public class Cargoplane extends AirVehicle {
    private double cargoCapacity;
    private double currentCargo;

    public Cargoplane(String name, double initialSpeed, double initialFuel, int initialAltitude, double cargoCapacity, double currentCargo) {
        super(name, initialSpeed, initialFuel, initialAltitude);
        this.cargoCapacity = cargoCapacity;
        this.currentCargo = currentCargo;
        this.fuelConsumptionRate = 2.4;
        this.speedingRate = 90;
        this.slowingRate = 60;
        this.altitudeChangingRateUp = 50;
        this.altitudeChangingRateDown = 130;
        if (currentCargo > cargoCapacity) {
            speedingRate -= 10;
            slowingRate += 10;
        }
    }

    public Cargoplane(String name, double initialSpeed, double initialFuel, int initialAltitude, double cargoCapacity) {
        super(name, initialSpeed, initialFuel, initialAltitude);
        this.cargoCapacity = cargoCapacity;
        this.fuelConsumptionRate = 2.4;
        this.speedingRate = 90;
        this.slowingRate = 60;
        this.altitudeChangingRateUp = 50;
        this.altitudeChangingRateDown = 130;
    }
}
