public class Airbus extends AirVehicle {
    public Airbus(String name, double initialSpeed, double initialFuel, int initialAltitude) {
        super(name, initialSpeed, initialFuel, initialAltitude);
        this.fuelConsumptionRate = 2.2;
        this.speedingRate = 95;
        this.slowingRate = 65;
        this.altitudeChangingRateUp = 60;
        this.altitudeChangingRateDown = 120;
    }
}
