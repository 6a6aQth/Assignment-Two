// This class also demonstrates inheritance from the base class Student
public class GraduateStudent extends Student {
    // Variables
    private int graduationyear;

    // Constructor
    public GraduateStudent(String name, int age, String studentId, int graduationyear) {
        super(name, age, studentId);
        this.graduationyear = graduationyear;
    }

    // Method overriding
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Graduation year: " + graduationyear);
    }

    public int getGraduationyear() {
        return graduationyear;
    }
}

