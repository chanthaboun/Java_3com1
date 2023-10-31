package Weeks_2;

public class Employee {

    private String empId;
    private String empName;
    private double empSalary;

    public void setEmpId(String id) {
        empId = id;
    }

    public void setEmpName(String name) {
        empName = name;
    }

    public void setEmpSalary(double salary) {
        empSalary = salary;
    }

    public String get() {
        return empName;
    }

    public String getEmpId() {
        return empId;
    }

    public double getEmpSalary() {
        return empSalary;
    }
}
