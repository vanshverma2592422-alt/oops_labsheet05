package labsheet05.question20;

class Employee {
    private int employeeId;
    private String employeeName;
    private double salary;
    private static int employeeCount = 0;
    protected String department = "Pharmacy";

    public Employee(int employeeId, String employeeName, double salary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        setSalary(salary);
        employeeCount++;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary >= 0) {
            this.salary = salary;
        } else {
            System.out.println("Negative salary rejected for " + employeeName + ".");
        }
    }

    public static int getEmployeeCount() {
        return employeeCount;
    }

    public void displayEmployee() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Name: " + employeeName);
        System.out.println("Salary: " + salary);
        System.out.println("Department: " + department);
    }
}

class Pharmacist extends Employee {
    private String licenseNo;

    public Pharmacist(int employeeId, String employeeName, double salary, String licenseNo) {
        super(employeeId, employeeName, salary);
        this.licenseNo = licenseNo;
    }

    public String getLicenseNo() {
        return licenseNo;
    }

    public void setLicenseNo(String licenseNo) {
        this.licenseNo = licenseNo;
    }

    public void displayRoleDetails() {
        displayEmployee();
        System.out.println("Role: Pharmacist, License: " + licenseNo);
    }
}

class StoreManager extends Employee {
    private int storeSection;

    public StoreManager(int employeeId, String employeeName, double salary, int storeSection) {
        super(employeeId, employeeName, salary);
        this.storeSection = storeSection;
    }

    public int getStoreSection() {
        return storeSection;
    }

    public void setStoreSection(int storeSection) {
        this.storeSection = storeSection;
    }

    public void displayRoleDetails() {
        displayEmployee();
        System.out.println("Role: Store Manager, Section: " + storeSection);
    }
}

class PharmacyEmployeeManager {
    // Default/package-private method, available to classes in this package.
    void displayEmployees(Employee[] employees) {
        int employeeTotal = 0;
        for (int i = 0; i < employees.length; i++) {
            Employee employee = employees[i];
            if (employee instanceof Pharmacist) {
                ((Pharmacist) employee).displayRoleDetails();
            } else if (employee instanceof StoreManager) {
                ((StoreManager) employee).displayRoleDetails();
            }
            employeeTotal++;
            System.out.println();
        }
        System.out.println("Employees processed: " + employeeTotal);
        System.out.println("Employee objects created: " + Employee.getEmployeeCount());
    }
}

public class PharmacyEmployeeMain {
    public static void main(String[] args) {
        Employee[] employees = {
            new Pharmacist(801, "Asha Perera", 67000.00, "PH-8101"),
            new StoreManager(802, "Ravi Kumar", 82000.00, 3),
            new Pharmacist(803, "Meera Silva", 69000.00, "PH-8102")
        };

        employees[1].setSalary(-1000.00);
        PharmacyEmployeeManager manager = new PharmacyEmployeeManager();
        manager.displayEmployees(employees);
    }
}