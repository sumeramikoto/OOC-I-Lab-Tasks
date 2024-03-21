public class Bus extends Vehicle {
    public Bus(String name, double initialSpeed, double initialFuel) {
        super(name, initialSpeed, initialFuel);
        setFuelConsumptionRate(1.5);
        setSpeedingRate(80);
        setSlowingRate(76);
    }
}
