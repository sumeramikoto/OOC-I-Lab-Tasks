public class Department {
    private String departmentName;
    private int departmentID;
    private int noOfStudent;
    private int noOfFaculty;

    public Department () {
        this.departmentName = "Unknown";
    }

    public Department (String departmentName, int departmentID) {
        this.departmentName = departmentName;
        this.departmentID = departmentID;
    }

    public Department (String departmentName, int departmentID, int noOfStudent, int noOfFaculty) {
        this.departmentName = departmentName;
        this.departmentID = departmentID;
        this.noOfStudent = noOfStudent;
        this.noOfFaculty = noOfFaculty;
    }
}
