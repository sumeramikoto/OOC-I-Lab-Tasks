abstract class AirVehicle extends Vehicle {
    private double initialAltitude;
    private double currentAltitude;
    protected int altitudeChangingRateUp;
    protected int altitudeChangingRateDown;

    // Constructor


    public AirVehicle(String name, double initialSpeed, double initialFuel, double initialAltitude) {
        super(name, initialSpeed, initialFuel);
        this.initialAltitude = initialAltitude;
        this.currentAltitude = initialAltitude;
    }

    public double getInitialAltitude() {
        return initialAltitude;
    }

    public double getCurrentAltitude() {
        return currentAltitude;
    }

    public void setAltitudeChangingRateUp(int altitudeChangingRateUp) {
        this.altitudeChangingRateUp = altitudeChangingRateUp;
    }

    public void setAltitudeChangingRateDown(int altitudeChangingRateDown) {
        this.altitudeChangingRateDown = altitudeChangingRateDown;
    }

    public void ascend(int ascendAmount) {
        currentAltitude = currentAltitude + (ascendAmount * altitudeChangingRateUp);
    }

    public void descend(int descendAmount) {
        currentAltitude = currentAltitude - (descendAmount * altitudeChangingRateDown);
    }

    @Override
    public void displayStatus() {
        System.out.println("Name - " + getName());
        System.out.println("Speed - " + getCurrentSpeed());
        System.out.println("Altitude - " + getCurrentAltitude());
        System.out.println("Remaining Fuel - " + getCurrentFuel());
    }
}
