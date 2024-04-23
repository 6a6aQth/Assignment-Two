// This class demonstrates inheritance, as it inherits from the base class Student
public class UndergraduateStudent extends Student {
    // Variables
    private String project;

    // Constructor
    public UndergraduateStudent(String name, int age, String studentId, String major) {
        super(name, age, studentId);
        this.project = project;
    }

    // Method overriding to customize behavior for undergraduate students
    @Override
    public void displayInfo() {
        super.displayInfo(); // calling the base class method
        System.out.println("Project: " + project);
    }


}
