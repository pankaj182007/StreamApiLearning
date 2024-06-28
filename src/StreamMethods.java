import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMethods {
    public static void main(String[] args) {

        //filter(Predicate)
           //boolean Value Function
           //e->e>10

        List<String> name = Arrays.asList("Pankaj", "Pushpendra", "amit", "Rahul");
        name.stream().filter(s -> s.startsWith("P")).forEach(System.out::println);


        //map(function)
            //each element operation

        List<Integer> num = Arrays.asList(1,2,3,4,5,6,7,8,9);
        List<Integer> squarNum = num.stream().map(integer -> integer * integer).collect(Collectors.toList());
        squarNum.forEach(integer -> System.out.println(integer));

        //Sorted in descending order
        squarNum.stream().sorted((o1, o2) -> o2.compareTo(o1)).forEach(System.out::println);

        // minimum
        Integer integer = squarNum.stream().min((o1, o2) -> o1.compareTo(o2)).get();
        System.out.println("MIN : "+integer);

        // Maximum
        Integer integer1 = squarNum.stream().max((x, y) -> x.compareTo(y)).get();
        System.out.println("MAX : "+integer1);

    }
}
