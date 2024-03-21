public class Student {
    private String name;
    private int age;
    private int id;

    // Constructor with multiple parameters
    public Student(String name, int age, int id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    public Student(String name) {
        this.name = name;
    }

    // Multiple Constructor with multiple parameters


    // Method to display student information
    public void displayStudentInfo() {
        System.out.println("Student Information:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("ID: " + id);
    }
}
