package com.employee.empregistrywithexceptionhandling.dto;

public class Employee {
    private Long empId;
    private String empName;
    private String empDept;
    private int age;

    public Employee() {

    }

    public Employee(Long empId, String empName, String empDept, int age) {
        this.empId = empId;
        this.empName = empName;
        this.empDept = empDept;
        this.age = age;
    }

    public Long getEmpId() {
        return empId;
    }

    public void setEmpId(Long empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpDept() {
        return empDept;
    }

    public void setEmpDept(String empDept) {
        this.empDept = empDept;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", empDept='" + empDept + '\'' +
                ", age=" + age +
                '}';
    }
}
