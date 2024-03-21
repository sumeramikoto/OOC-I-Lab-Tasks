public class Grade {
    private double attendanceMarks;
    private double quizMarks;
    private double midMarks;
    private double finalMarks;

    public Grade(double attendanceMarks, double quizMarks, double midMarks, double finalMarks) {
        this.attendanceMarks = attendanceMarks;
        this.quizMarks = quizMarks;
        this.midMarks = midMarks;
        this.finalMarks = finalMarks;
    }

    private double getTotalMarks() {
        double totalMarks = (attendanceMarks + quizMarks + midMarks + finalMarks) / 300;
        return totalMarks;
    }
    public void displayGrades() {
        System.out.println("Grade Information: ");
        double totalMarks = getTotalMarks();
        if (totalMarks >= 0.8) {
            System.out.println("Obtained grade: A+");
        }
        else if (totalMarks >= 0.75 && totalMarks < 0.8) {
            System.out.println("Obtained grade: A");
        }
        else if (totalMarks >= 0.7 && totalMarks < 0.75) {
            System.out.println("Obtained grade: A-");
        }
        else if (totalMarks >= 0.65 && totalMarks < 0.7) {
            System.out.println("Obtained grade: B+");
        }
        else if (totalMarks >= 0.6 && totalMarks < 0.65) {
            System.out.println("Obtained grade: B");
        }
        else if (totalMarks >= 0.55 && totalMarks < 0.6) {
            System.out.println("Obtained grade: B-");
        }
        else if (totalMarks >= 0.5 && totalMarks < 0.55) {
            System.out.println("Obtained grade: C+");
        }
        else if (totalMarks >= 0.45 && totalMarks < 0.5) {
            System.out.println("Obtained grade: C");
        }
        else if (totalMarks >= 0.4 && totalMarks < 0.45) {
            System.out.println("Obtained grade: D");
        }
        else {
            System.out.println("Obtained grade: F");
        }
    }
}
