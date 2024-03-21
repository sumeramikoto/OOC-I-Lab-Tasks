public class GroundVehicle extends Vehicle {

    @Override
    public void displayStatus() {
        System.out.println("Name - " + getName());
        System.out.println("Speed - " + getCurrentSpeed());
        System.out.println("Remaining Fuel - " + getCurrentFuel());
    }
}
