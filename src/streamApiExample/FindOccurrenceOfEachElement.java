package streamApiExample;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindOccurrenceOfEachElement {
    public static void main(String[] args) {
       List<Employee> elist= Arrays.asList( new Employee("Pankaj", 23, "it", 94547),
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

        System.out.println("Example of Find number of employee GroupBy Department ");
       elist.stream().collect(Collectors.groupingBy(employee -> employee.geteDepartment(),Collectors.counting())).forEach((s, aLong) -> System.out.println(s+" : "+aLong));


        System.out.println("\n\nFind occurrence of each latter in the given string ");
       String str="eeeeeoooopppppggggrrraaiiintreeeccccmmmmhysgqqqqqyrvzjjjj";
       str.chars().mapToObj(value -> (char)value).collect(Collectors.groupingBy(character -> character,Collectors.counting())).forEach((character, aLong) -> System.out.println(character+" : "+aLong));


        System.out.println("\n\nFind occurrence of each latter in the given string using other method 1");
        str.codePoints().mapToObj(value -> (char)value).collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).forEach((character, aLong) -> System.out.println(character+" : "+aLong));

        System.out.println("\n\nFind occurrence of each latter in the given string using other method 2");
        str.chars().mapToObj(value -> (char)value).collect(Collectors.groupingBy(Character::charValue,Collectors.counting())).forEach((character, aLong) ->  System.out.println(character+" : "+aLong));


    }
}
