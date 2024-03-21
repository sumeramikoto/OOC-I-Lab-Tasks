public class Main {
    public static void main(String[] args) {
        // Create an instance of the Student class
        Student student1 = new Student("Rohim Mia", 20, 220042101);
        Course course1 = new Course("SWE 4202", "OOC-1 Lab");
        Grade grade1 = new Grade(10, 20, 30, 40);

        // Create an instance of the Course class

        // Create an instance of the Grade class

        // Display information using methods
        student1.displayStudentInfo();
        course1.displayCourseInfo();
        grade1.displayGrades();
     }
}
