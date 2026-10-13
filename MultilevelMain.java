package labsheet05.question15;

// Person is the top-level super class.
class Person {
    protected String name;
    protected int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

// Employee is a child of Person and the super class for Manager.
class Employee extends Person {
    private int employeeId;

    public Employee(String name, int age, int employeeId) {
        super(name, age);
        this.employeeId = employeeId;
    }

    protected int getEmployeeId() {
        return employeeId;
    }
}

// Manager is the final child in the inheritance chain.
class Manager extends Employee {
    private int teamSize;

    public Manager(String name, int age, int employeeId, int teamSize) {
        super(name, age, employeeId);
        this.teamSize = teamSize;
    }

    public void displayManager() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Employee ID: " + getEmployeeId());
        System.out.println("Team size: " + teamSize);
    }
}

public class MultilevelMain {
    public static void main(String[] args) {
        Manager manager = new Manager("Kiran Jay", 38, 405, 8);
        manager.displayManager();
    }
}