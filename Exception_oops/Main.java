package Exception_oops;
public class Main {
    public static void main(String[] args) {
        try {
            Student s = new Student("Kanha", 22, 85);
            s.show();
            Student s2 = new Student("Rohan", 21, 120);
            s2.show();
        } catch (InvalidMarksException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}


