package employeemanagementsystem;
import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Starter {
    public static void main(String[] args)
    {   EmployeeData obj1 = new EmployeeData();
        List<Employee>ls = obj1.getData();


        //Find employees earning more than ₹80,000.
        ls.stream().filter(e->e.salary>80000).forEach(e->System.out.println(e.name+"="+e.salary));

        //Find all employees older than 30 years.
        ls.stream().filter(e->e.age>30).forEach(e->System.out.println("Name: "+e.name+" Age: "+e.age));

        //count employee departmentwise
        Map<String,Long> mp1 = ls.stream().collect(Collectors.groupingBy(e->e.department,Collectors.counting()));
        System.out.println(mp1);

        //highest-paid employee in each department.
        Map<String,Optional<Employee>> mp2 = ls.stream().collect(Collectors.groupingBy((Employee e)->e.department,Collectors.maxBy((e1,e2)->
                (int)(e2.salary-e1.salary))));

        //average salary of every department
        //averaging double
        Map<String,Double> mp3 = ls.stream().collect(Collectors.groupingBy(e->e.department,Collectors
                .averagingDouble(e->e.salary)));
        System.out.println(mp3);

        //youngest employee in the company
        Optional<Employee> youngest = ls.stream().collect(Collectors.maxBy((e1,e2)->
                e2.age-e1.age));
        System.out.println(youngest);

        //top 5 highest paid employee
        ls.stream().sorted((e1,e2)->(int)(e2.salary-e1.salary)).
                limit(5).forEach(e->System.out.println(e.name+"="+e.salary));

        //departments whose average salary exceeds ₹1 lakh.

         ls.stream().collect(Collectors.groupingBy(e->e.department,
                Collectors.averagingLong(e->e.salary))).entrySet().stream().filter(e1->e1.getValue()>10_00_00).
                 forEach(e->System.out.println(e.getKey()+"="+e.getValue()));



    }
}
