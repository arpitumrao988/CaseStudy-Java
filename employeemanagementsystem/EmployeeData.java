package employeemanagementsystem;
import java.util.*;
public class EmployeeData {
    public List<Employee> getData()
    {
        return Arrays.asList(
                new Employee(101, "Amit", "IT", 70000, 25, "Male"),
                new Employee(102, "Rahul", "IT", 90000, 30, "Male"),
                new Employee(103, "Neha", "HR", 75000, 28, "Female"),
                new Employee(104, "Priya", "HR", 60000, 24, "Female"),
                new Employee(105, "Vikas", "Sales", 85000, 32, "Male"),
                new Employee(106, "Anjali", "Sales", 65000, 27, "Female"),
                new Employee(107, "Mohit", "Finance", 95000, 35, "Male"),
                new Employee(108, "Sneha", "Finance", 80000, 29, "Female"),
                new Employee(109, "Karan", "IT", 55000, 23, "Male"),
                new Employee(110, "Pooja", "Marketing", 72000, 31, "Female")
        );

    }

}
