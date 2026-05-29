package employeemanagementsystem;

import stringdemo.StringDemo;

import java.util.Date;

public class Employee {
    int employeeId;
    String name;
    String department;
    long salary;
    int age;
    String date = new Date().toString();
    String gender;
    Employee(int employeeId, String name, String department,long salary,int age,String gender)
    {
        this.employeeId= employeeId;
        this.name = name;
        this.department = department;
        this.salary = salary;
        this.age = age;
        this.gender = gender;
    }
    @Override
    public String toString() {
        return "Employee{" +
                "id=" + employeeId +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                '}';
    }
}
