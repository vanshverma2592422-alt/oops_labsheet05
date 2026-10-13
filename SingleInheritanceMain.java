package labsheet05.question13;

// Employee is the super class.
class Employee {
    protected int employeeId;
    protected String employeeName;
    protected double salary;

    public Employee(int employeeId, String employeeName, double salary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.salary = salary;
    }

    public void displayEmployee() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Employee name: " + employeeName);
        System.out.println("Salary: " + salary);
    }
}

// Pharmacist is the child class.
class Pharmacist extends Employee {
    private String licenseNo;

    public Pharmacist(int employeeId, String employeeName, double salary, String licenseNo) {
        super(employeeId, employeeName, salary);
        this.licenseNo = licenseNo;
    }

    public void displayPharmacist() {
        displayEmployee();
        System.out.println("License number: " + licenseNo);
    }
}

public class SingleInheritanceMain {
    public static void main(String[] args) {
        Pharmacist pharmacist = new Pharmacist(302, "Meera Silva", 68000.00, "PH-9021");
        pharmacist.displayPharmacist();
    }
}