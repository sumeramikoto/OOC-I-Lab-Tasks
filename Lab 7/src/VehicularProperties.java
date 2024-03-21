abstract class VehicularProperties {
    private String name;
    private double initialSpeed;
    private double currentSpeed;
    private double initialFuel;
    private double currentFuel;
    protected double fuelConsumptionRate;
    protected double speedingRate;
    protected double slowingRate;


    public String getName() {
        return name;
    }
    public double getInitialSpeed() {
        return initialSpeed;
    }

    public double getCurrentSpeed() {
        return currentSpeed;
    }

    public double getInitialFuel() {
        return initialFuel;
    }

    public double getCurrentFuel() {
        return currentFuel;
    }

    public void setFuelConsumptionRate(double fuelConsumptionRate) {
        this.fuelConsumptionRate = fuelConsumptionRate;
    }

    public double getFuelConsumptionRate() { return fuelConsumptionRate; }

    public void setName(String name) { this.name = name; }

    public void setSpeedingRate(double speedingRate) {
        this.speedingRate = speedingRate;
    }

    public void setSlowingRate(double slowingRate) {
        this.slowingRate = slowingRate;
    }

    public void setCurrentFuel(double currentFuel) {
        this.currentFuel = currentFuel;
    }

    public double getSpeedingRate() {
        return speedingRate;
    }

    public double getSlowingRate() {
        return slowingRate;
    }

    public void setCurrentSpeed(double currentSpeed) {
        this.currentSpeed = currentSpeed;
    }
}
