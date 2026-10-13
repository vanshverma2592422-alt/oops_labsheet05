package labsheet05.question10;

class Employee {
    private int employeeId;
    private String employeeName;
    private double salary;

    public Employee(int employeeId, String employeeName, double salary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.salary = salary;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public double getSalary() {
        return salary;
    }

    public void displayEmployee() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Employee name: " + employeeName);
        System.out.println("Salary: " + salary);
    }
}

public class PrivateAccessMain {
    public static void main(String[] args) {
        Employee employee = new Employee(501, "Meera Silva", 75000.00);
        System.out.println("Employee ID from getter: " + employee.getEmployeeId());
        System.out.println("Name from getter: " + employee.getEmployeeName());
        System.out.println("Salary from getter: " + employee.getSalary());
        employee.displayEmployee();

        // employee.salary is not allowed because salary is private.
    }
}