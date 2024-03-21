import java.util.Random;
public class Personnel {
    private String name;
    private String address;
    protected int dayOfBirth;
    protected int monthOfBirth;
    protected int yearOfBirth;
    protected int joiningYear;
    public int ID;
    protected int age;

    Random rand = new Random();

    public Personnel () {
        this.name = "Unknown";
    }
    public Personnel (String name, String address, int dayOfBirth, int monthOfBirth, int yearOfBirth, int joiningYear) {
        this.name = name;
        this.address = address;
        this.dayOfBirth = dayOfBirth;
        this.monthOfBirth = monthOfBirth;
        this.yearOfBirth = yearOfBirth;
        this.joiningYear = joiningYear;
    }

    public Personnel (String name, int dayOfBirth, int monthOfBirth, int yearOfBirth) {
        this.name = name;
        this.dayOfBirth = dayOfBirth;
        this.monthOfBirth = monthOfBirth;
        this.yearOfBirth = yearOfBirth;
    }
    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public int getDayOfBirth() {
        return dayOfBirth;
    }

    public int getMonthOfBirth() {
        return monthOfBirth;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public int getJoiningYear() {
        return joiningYear;
    }
    public int getID () {
        return 0;
    }

    public int getAge() {
        return (2023 - yearOfBirth);
    }

    void displayInfo() {
        System.out.println("Name: " + getName());
        System.out.println("Date of Birth: " + getDayOfBirth() + "/" + getMonthOfBirth() + "/" + getYearOfBirth());
        System.out.println("Address: " + getAddress());
        System.out.println("ID: " + getID());
        System.out.println("Age: " + getAge());
    }
}
