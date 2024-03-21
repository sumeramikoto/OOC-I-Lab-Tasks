public class Course {
    private String courseCode;
    private String courseName;

    public Course (String courseCode, String courseName) {
        this.courseCode = courseCode;
        this.courseName = courseName;
    }
    public void displayCourseInfo() {
        System.out.println("Course Information: ");
        System.out.println("Course Code: " + courseCode);
        System.out.println("Course Name: " + courseName);
    }
}
