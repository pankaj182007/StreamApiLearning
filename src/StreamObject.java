import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamObject {
    public static void main(String[] args) {

        //to Create Stream Object there are following ways

        //1 blank object
        Stream<Object> emptyStream = Stream.empty();

        //2 array,object,collection
        String name[]={"Pankaj","Pushpendra","Amit","Rahul"};
        Stream<String> nameStream = Stream.of(name);
        nameStream.forEach(e-> System.out.println(e));

        //3 using builder
        Stream<Object> buildStream = Stream.builder().build();

        //4 using Arrays and passing anonymous array
        IntStream stream = Arrays.stream(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10});
        stream.forEach(value -> System.out.println(value));

        //5 using List,Set
        List<Integer> list=Arrays.asList(1,2,3,4,5,6,7,8,9);
        Stream<Integer> stream1 = list.stream();
        stream1.forEach(integer -> System.out.println(integer));

    }
}
