public class Faculty extends Personnel {
    private String department;
    private String designation;
    private String roomNum;

    public int getDepartmentID() {
        if (department == "MPE") {
            return 1;
        } else if (department == "EEE") {
            return 2;
        } else if (department == "TVE") {
            return 3;
        } else if (department == "CSE") {
            return 4;
        } else if (department == "CEE") {
            return 5;
        } else if (department == "BTM") {
            return 6;
        } else {
            return -1; // -1
        }
    }
    int max = 19, min = 10;
    int randomNum = rand.nextInt(max - min + 1) + min;

    @Override
    public int getID() {
        return getDepartmentID() + joiningYear + dayOfBirth + randomNum;
    }

    public String getDepartment() {
        return department;
    }
    public String getDesignation() {
        return designation;
    }

    public String getRoomNum() {
        return roomNum;
    }
    public Faculty (String name, String address, int dayOfBirth, int monthOfBirth, int yearOfBirth, int joiningYear, String department, String designation, String roomNum) {
        super(name, address, dayOfBirth, monthOfBirth, yearOfBirth, joiningYear);
        this.department = department;
        this.ID = getID();
        this.roomNum = roomNum;
        this.designation = designation;
    }

    void displayFacultyInfo() {
        System.out.println("Faculty Information\n--------------");
        super.displayInfo();
        System.out.println("Department: " +getDepartment());
        System.out.println("Designation: " +getDesignation());
        System.out.println("ID: " +ID);
        System.out.println("Room Number: " +getRoomNum());
    }
}
