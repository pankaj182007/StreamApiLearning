import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class StreamOperations {
    public static void main(String[] args) {
  //Operations after creating Stream Object
        //.filter()
        //.map()
        //.sorted()
        //.limit()
        //.distinct()
        //.peek()
        //.skip()
        //.flatMap()


        List<String> name=Arrays.asList("Pankaj","Pushpendra","Amit","Rahul","Pankaj","Pushpendra","Amit","Rahul","Pankaj","Pushpendra","Amit","Rahul");

        //Stream.filter()
        //it is used to filter out the collection
        name.stream().filter(n->n.startsWith("P")||n.startsWith("p")).forEach(System.out::println);

        //Stream.map()
        //it is used to perform operations on collection
        System.out.println("\n----------------------------------------------------\n");
        name.stream().map(s -> s.toUpperCase()).forEach(System.out::println);
        //or
        System.out.println("\nDoing upper case by using Method reference\n");
        name.stream().map(String::toUpperCase).forEach(System.out::println);

        //Stream.sorted()
        // to sorted() a collection
        System.out.println("\n----------------------To sort a collection------------------------------\n");
        name.stream().sorted().forEach(System.out::println);

        //Stream..sorted()
        // to sorted() a collection using comparator
        System.out.println("\n----------------------To sort a collection using comparator------------------------------\n");
        name.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);

        // using Limit() method in Stream
        System.out.println("\n----------------------using Limit method in Stream------------------------------\n");
        name.stream().sorted(Comparator.reverseOrder()).limit(3).forEach(System.out::println);

        // doing Distinct() method for unique values or remove duplicate values
        System.out.println("\n----------------------using distinct method in Stream------------------------------\n");
        name.stream().distinct().forEach(System.out::println);

        //Stream.peek()
        //using peek method
        System.out.println("\n----------------------using peek method in Stream------------------------------\n");
        name.stream().peek(s -> System.out.println("filtered value : "+s)).distinct().forEach(System.out::println);

        //Stream.skip
        //it is used to skip elements from starting
        System.out.println("\n----------------------using Skip method in Stream------------------------------\n");
        name.stream().sorted().skip(3).forEach(s -> System.out.println(s));




    }
}
