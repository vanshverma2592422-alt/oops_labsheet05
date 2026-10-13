package labsheet05.question19;

class Person {
    protected String name;
    protected int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class Employee extends Person {
    private int employeeId;
    private double salary;
    private static int employeeCount = 0;

    public Employee(String name, int age, int employeeId, double salary) {
        super(name, age);
        this.employeeId = employeeId;
        this.salary = salary;
        employeeCount++;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary >= 0) {
            this.salary = salary;
        }
    }

    public static int getEmployeeCount() {
        return employeeCount;
    }

    public void displayEmployee() {
        System.out.println("Name: " + name + ", Age: " + age + ", Employee ID: " + employeeId
                + ", Salary: " + salary);
    }
}

class Doctor extends Employee {
    private String specialization;

    public Doctor(String name, int age, int employeeId, double salary, String specialization) {
        super(name, age, employeeId, salary);
        this.specialization = specialization;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void displayDoctor() {
        displayEmployee();
        System.out.println("Role: Doctor, Specialization: " + specialization);
    }
}

class Pharmacist extends Employee {
    private String licenseNo;

    public Pharmacist(String name, int age, int employeeId, double salary, String licenseNo) {
        super(name, age, employeeId, salary);
        this.licenseNo = licenseNo;
    }

    public String getLicenseNo() {
        return licenseNo;
    }

    public void displayPharmacist() {
        displayEmployee();
        System.out.println("Role: Pharmacist, License: " + licenseNo);
    }
}

class HospitalStaffManager {
    public void displayStaff(Employee[] staff) {
        int doctors = 0;
        for (int i = 0; i < staff.length; i++) {
            if (staff[i] instanceof Doctor) {
                Doctor doctor = (Doctor) staff[i];
                doctor.displayDoctor();
                doctors++;
            } else if (staff[i] instanceof Pharmacist) {
                Pharmacist pharmacist = (Pharmacist) staff[i];
                pharmacist.displayPharmacist();
            }
            System.out.println();
        }
        System.out.println("Doctor count: " + doctors);
        System.out.println("Total employees: " + Employee.getEmployeeCount());
    }
}

public class HospitalStaffMain {
    public static void main(String[] args) {
        Employee[] staff = {
            new Doctor("Asha Perera", 42, 701, 95000.00, "Cardiology"),
            new Pharmacist("Ravi Kumar", 35, 702, 68000.00, "PH-7781"),
            new Doctor("Meera Silva", 39, 703, 91000.00, "Pediatrics")
        };

        HospitalStaffManager manager = new HospitalStaffManager();
        manager.displayStaff(staff);
    }
}