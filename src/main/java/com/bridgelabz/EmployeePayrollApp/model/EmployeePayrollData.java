package java.com.bridgelabz.EmployeePayrollApp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "employee_payroll")
public class EmployeePayrollData {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long employeeId;

    private String name;
    private double salary;

    // Default Constructor
    public EmployeePayrollData() {}

    // Constructor
    public EmployeePayrollData(long employeeId,
                               String name, double salary) {
        this.employeeId = employeeId;
        this.name = name;
        this.salary = salary;
    }

    // Getters
    public long getEmployeeId() { return employeeId; }
    public String getName() { return name; }
    public double getSalary() { return salary; }

    // Setters
    public void setEmployeeId(long employeeId) {
        this.employeeId = employeeId;
    }
    public void setName(String name) { this.name = name; }
    public void setSalary(double salary) { this.salary = salary; }

    @Override
    public String toString() {
        return "EmployeePayrollData: " +
                "employeeId=" + employeeId +
                ", name=" + name +
                ", salary=" + salary;
    }
}