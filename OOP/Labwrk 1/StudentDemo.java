public class StudentDemo {

    public static void main(String[] args) {
        System.out.println(" Student Details ");

        Student student1 = new Student(101, "John", 75);
        Student student2 = new Student(102, "Sarah", 45);

        student1.displayDetails();
        if (student1.isPassed() == true) {
            System.out.println("Status: Passed");
        } else {
            System.out.println("Status: Failed");
        }

        student2.displayDetails();
        if (student2.isPassed() == true) {
            System.out.println("Status: Passed");
        } else {
            System.out.println("Status: Failed");
        }

        compareMarks(student1, student2);
    }

    public static void compareMarks(Student s1, Student s2) {
        if (s1.marks > s2.marks) {
            System.out.println(s1.name + " scored higher than " + s2.name);
        } else if (s2.marks > s1.marks) {
            System.out.println(s2.name + " scored higher than " + s1.name);
        } else {
            System.out.println("Both students have equal marks.");
        }
    }
}