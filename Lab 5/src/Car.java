public class Car extends Vehicle {
    public Car(String name, double initialSpeed, double initialFuel) {
        super(name, initialSpeed, initialFuel);
        setFuelConsumptionRate(1.2);
        setSpeedingRate(85);
        setSlowingRate(75);
    }
}
