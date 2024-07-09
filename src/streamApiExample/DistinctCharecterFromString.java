package streamApiExample;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DistinctCharecterFromString {
    public static void main(String[] args) {
        String s1="pushpendra";
        System.out.println("original Element : "+s1);

        System.out.print("\nDistinct Element method 1 : ");
        s1.codePoints().mapToObj(value -> (char)value).distinct().forEach(System.out::print);

        System.out.print("\nDistinct Element method 2 : ");
        s1.chars().mapToObj(value -> (char)value).distinct().forEach(System.out::print);

        System.out.print("\nDistinct Element method 3 : ");
        Stream.of(s1.split("")).distinct().forEach(System.out::print);

        System.out.print("\nDistinct Element method 4 : ");
        Arrays.stream(s1.split("")).distinct().forEach(System.out::print);


        String collect = Arrays.stream(s1.split("")).distinct().collect(Collectors.joining());
        System.out.print("\nDistinct Element method 5 : "+collect);

    }
}
