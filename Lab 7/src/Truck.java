public class Truck extends VehicularProperties implements Vehicle {
    public Truck() {
        setName("terak");
        setCurrentSpeed(55);
        setCurrentFuel(100);
        setFuelConsumptionRate(1.8);
        setSpeedingRate(78);
        setSlowingRate(60);
    }

    public void move(double distance) {
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

    public void speedUp(double amount) {
        double currentSpeed = getCurrentSpeed();
        double speedingRate = getSpeedingRate();

        currentSpeed += ((speedingRate/100) * amount);
        setCurrentSpeed(currentSpeed);
    }

    public void slowDown(double amount) {
        double currentSpeed = getCurrentSpeed();
        double slowingRate = getSlowingRate();

        currentSpeed -= ((slowingRate/100) * amount);
        setCurrentSpeed(currentSpeed);
    }

    public void refuel(double amount) {
        double currentFuel = getCurrentFuel();
        currentFuel += amount;
        setCurrentFuel(currentFuel);
    }

    public void displayStatus() {
        System.out.println("Name - " + getName());
        System.out.println("Speed - " + getCurrentSpeed());
        System.out.println("Remaining Fuel - " + getCurrentFuel());
    }
}
