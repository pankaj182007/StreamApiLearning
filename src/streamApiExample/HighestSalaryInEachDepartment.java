package streamApiExample;

import java.util.*;
import java.util.stream.Collectors;

public class HighestSalaryInEachDepartment {
    public static void main(String[] args) {
        List<Employee> employeeList = Arrays.asList(new Employee("Pankaj", 23, "it", 94547),
                new Employee("Amit", 25, "it", 74583),
                new Employee("Rahul", 28, "it", 135678),
                new Employee("Kanak", 33, "hr", 20000),
                new Employee("Pushpendra", 33, "it", 200000),
                new Employee("Rakhi", 26, "it", 20000),
                new Employee("Ankit", 23, "it", 80000),
                new Employee("Sumit", 29, "hr", 60000),
                new Employee("Anuj", 28, "it", 20000),
                new Employee("Ankur", 27, "it", 30000),
                new Employee("Amit", 26, "it", 20000),
                new Employee("Pushpa", 43, "hr", 50000),
                new Employee("Payal", 30, "it", 20000),
                new Employee("Piyush", 31, "it", 20000),
                new Employee("Pankaj", 20, "it", 17649),
                new Employee("Sumit", 21, "hr", 20000),
                new Employee("Sagar", 24, "it", 225783),
                new Employee("Kunaal", 23, "it", 20000),
                new Employee("Rishu", 50, "md", 300278)
        );

        // Find the highest salary in Department
        System.out.println("The highest salaried Employee in Department : ");
        Map<String, Employee> collect = employeeList.stream().collect(Collectors.groupingBy(employee -> employee.geteDepartment(), Collectors.collectingAndThen(Collectors.maxBy((o1, o2) -> o1.geteSalary() - o2.geteSalary()), Optional::get)));
        collect.forEach((s, employee) -> System.out.println(s+" : "+employee));

        // Find the highest salary in Department using other method
        System.out.println("\nThe highest salaried Employee in Department using other method : ");
        Map<String, Employee> collect1 = employeeList.stream().collect(Collectors.groupingBy(Employee::geteDepartment, Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparingInt(Employee::geteSalary)), Optional::get)));
        collect1.forEach((s, employee) -> System.out.println(s+" : "+employee));

    }
}
