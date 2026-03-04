public class Student {
    int id;
    String name;
    int marks;

    public Student(int studentId, String studentName, int studentMarks) {
        this.id = studentId;
        this.name = studentName;
        this.marks = studentMarks;
    }

    public void displayDetails() {
        System.out.println("Student ID: " + id);
        System.out.println("Student Name: " + name);
        System.out.println("Student Marks: " + marks);
    }

    public boolean isPassed() {
        if (marks >= 50) {
            return true;
        } else {
            return false;
        }
    }
}