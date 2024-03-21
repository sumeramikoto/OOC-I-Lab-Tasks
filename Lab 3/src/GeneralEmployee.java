public class GeneralEmployee extends Personnel {
    int max = 19, min = 5;
    int randomNum = rand.nextInt(max - min + 1) + min;

    @Override
    public int getID() {
        return dayOfBirth + joiningYear + randomNum;
    }

    public GeneralEmployee (String name, String address, int dayOfBirth, int monthOfBirth, int yearOfBirth, int joiningYear) {
        super(name, address, dayOfBirth, monthOfBirth, yearOfBirth, joiningYear);
        this.ID = getID();
    }

    void displayEmployeeInfo() {
        System.out.println("General Employee Information\n--------------");
        super.displayInfo();
        System.out.println("ID: " +ID);
    }
}
