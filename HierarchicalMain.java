package labsheet05.question14;

// Person is the super class shared by both child classes.
class Person {
    protected String name;
    protected int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayPerson() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

// Doctor and Nurse are separate child classes of Person.
class Doctor extends Person {
    private String specialization;

    public Doctor(String name, int age, String specialization) {
        super(name, age);
        this.specialization = specialization;
    }

    public void displayDoctor() {
        displayPerson();
        System.out.println("Specialization: " + specialization);
    }
}

class Nurse extends Person {
    private String ward;

    public Nurse(String name, int age, String ward) {
        super(name, age);
        this.ward = ward;
    }

    public void displayNurse() {
        displayPerson();
        System.out.println("Ward: " + ward);
    }
}

public class HierarchicalMain {
    public static void main(String[] args) {
        Doctor doctor = new Doctor("Asha Perera", 42, "Cardiology");
        Nurse nurse = new Nurse("Nimal Fernando", 31, "Children's ward");
        doctor.displayDoctor();
        nurse.displayNurse();
    }
}