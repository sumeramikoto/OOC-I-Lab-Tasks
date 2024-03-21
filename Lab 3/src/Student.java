public class Student extends Personnel {
    private String department;
    private String program;


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

    @Override
    public int getID () {
        return getDepartmentID() + dayOfBirth + joiningYear + rand.nextInt(10);
    }

    public Student (String name, String address, int dayOfBirth, int monthOfBirth, int yearOfBirth, int joiningYear, String department, String program) {
        super(name, address, dayOfBirth, monthOfBirth, yearOfBirth, joiningYear);
        this.department = department;
        this.program = program;
        this.ID = getID();
    }

    public String getDepartment() {
        return department;
    }

    public String getProgram() {
        return program;
    }

    void displayStudentInfo() {
        System.out.println("Student Information\n--------------");
        super.displayInfo();
        System.out.println("Department: " +getDepartment());
        System.out.println("Program: " +getProgram());
        System.out.println("ID: " +ID);
    }
}
