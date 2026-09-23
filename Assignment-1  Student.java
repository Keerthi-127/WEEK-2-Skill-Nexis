public class Student {

    // Attributes
    private String name;
    private int rollNumber;
    private double marks;

    // Constructor
    public Student(String name, int rollNumber, double marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    // Method to display student information
    public void displayStudentInfo() {
        System.out.println("===== STUDENT INFORMATION =====");
        System.out.println("Name       : " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks      : " + marks);
    }

    // Main method
    public static void main(String[] args) {

        Student student = new Student("Keerthi", 101, 85.5);

        student.displayStudentInfo();
    }
}
