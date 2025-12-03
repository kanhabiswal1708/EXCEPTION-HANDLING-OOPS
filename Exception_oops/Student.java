package Exception_oops;
public class Student extends Person {
    int marks;
    public Student(String name, int age, int marks) throws InvalidMarksException {
        super(name, age);
        if (marks < 0 || marks > 100) {
            throw new InvalidMarksException("Marks must be between 0 and 100");
        }
        this.marks = marks;
    }
    @Override
    void show() {
        super.show();
        System.out.println("Marks: " + marks);
    }
}

