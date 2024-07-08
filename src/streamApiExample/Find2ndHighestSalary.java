package streamApiExample;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Find2ndHighestSalary {
    public static void main(String[] args) {
        List<Employee> eList= Arrays.asList(new Employee("Pankaj",23,"it",94547),
                                            new Employee("Amit",25,"it",74583),
                                            new Employee("Rahul",28,"it",135678),
                                            new Employee("Kanak",33,"hr",20000),
                                            new Employee("Pushpendra",33,"it",200000),
                                            new Employee("Rakhi",26,"it",20000),
                                            new Employee("Ankit",23,"it",80000),
                                            new Employee("Sumit",29,"hr",60000),
                                            new Employee("Anuj",28,"it",20000),
                                            new Employee("Ankur",27,"it",30000),
                                            new Employee("Amit",26,"it",20000),
                                            new Employee("Pushpa",43,"hr",50000),
                                            new Employee("Payal",30,"it",20000),
                                            new Employee("Piyush",31,"it",20000),
                                            new Employee("Pankaj",20,"it",17649),
                                            new Employee("Sumit",21,"hr",20000),
                                            new Employee("Sagar",24,"it",225783),
                                            new Employee("Kunaal",23,"it",20000),
                                            new Employee("Rishu",50,"md",300278)
                                            );

        //Find 2nd highest salaried Employee
        Optional<Employee> first = eList.stream().sorted((o1, o2) -> o2.geteSalary() - o1.geteSalary()).skip(1).findFirst();
        System.out.println("Second highest salaried Employee : \n"+first);

        //Find 2nd highest salaried Employee using comparator
        Employee employee = eList.stream().sorted(Comparator.comparingInt(Employee::geteSalary).reversed()).skip(1).findFirst().get();
        System.out.println("\nSecond highest salaried Employee using comparator : \n"+employee);
    }
}
