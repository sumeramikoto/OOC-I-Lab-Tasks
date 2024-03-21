abstract class Vehicle {
    private String name;
    private double initialSpeed;
    private double currentSpeed;
    private double initialFuel;
    private double currentFuel;
    protected double fuelConsumptionRate;
    protected double speedingRate;
    protected double slowingRate;

    // Constructor


    public Vehicle(String name, double initialSpeed, double initialFuel) {
        this.name = name;
        this.initialSpeed = initialSpeed;
        this.initialFuel = initialFuel;
        this.currentSpeed = initialSpeed;
        this.currentFuel = initialFuel;
    }

    // Getters & Setters
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

    public double getFuelConsumptionRate() {
        return fuelConsumptionRate;
    }

    public void setSpeedingRate(double speedingRate) {
        this.speedingRate = speedingRate;
    }

    public void setSlowingRate(double slowingRate) {
        this.slowingRate = slowingRate;
    }

    public void setCurrentFuel(double currentFuel) {
        this.currentFuel = currentFuel;
    }

    // Behaviors
    public void move(int distance) {
        double currentFuel = getCurrentFuel();
        double rate = getFuelConsumptionRate();
        if (currentFuel > 0) {
            System.out.println(getName()+" has started moving");
            double fuelConsumed = rate * distance;
            double newFuel = currentFuel - fuelConsumed;
            if (newFuel < 0) {
                newFuel = 0;
            }
            setCurrentFuel(newFuel);
        }
    }

    public void turn(String direction) {
        System.out.println("You've now turned " + direction);
    }

    public void speedUp(double speedingAmount) {
        currentSpeed += ((speedingRate/100) * speedingAmount);
    }

    public void slowDown(double slowingAmount) {
        currentSpeed -= ((slowingRate/100) * slowingAmount);
    }

    public void refuel(double refuelAmount) {
        currentFuel += refuelAmount;
    }

    public void displayStatus() {
        System.out.println("Name - " + name);
        System.out.println("Speed - " + currentSpeed);
        System.out.println("Remaining Fuel - " + currentFuel);
    }


}
