package labsheet05.question01;

class Student {
    String name;
    int rollNo;
    double marks;

    public Student() {
        name = "Asha";
        rollNo = 101;
        marks = 87.5;
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll number: " + rollNo);
        System.out.println("Marks: " + marks);
    }
}

public class StudentMain {
    public static void main(String[] args) {
        Student student = new Student();
        student.displayDetails();
    }
}