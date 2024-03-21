public interface Vehicle {
    void move(double distance);
    void turn(String side);
    void speedUp(double amount);
    void slowDown(double amount);
    void refuel(double amount);
    void displayStatus();
}
