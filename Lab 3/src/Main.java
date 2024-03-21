//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("XYZ", "ABV", 22, 01, 2004, 2023, "CSE", "SWE");
        student1.displayStudentInfo();
        System.out.print("\n\n\n");
        Faculty faculty1 = new Faculty("FAC", "FACADR", 10, 01, 1990, 2021, "CSE", "Lecturer", "404");
        faculty1.displayFacultyInfo();
    }
}