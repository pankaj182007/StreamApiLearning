import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMapExample {
    public static void main(String[] args) {
      String[][] arrayofarray = new String[][]{{"a","b","c","d"},{"e","f","g","h"},{"i","j","k","l"}};

        List<Integer> num1= Arrays.asList(12,13,14,15,16);
        List<Integer> num2=Arrays.asList(17,18,19,20,21);
        List<Integer> num3=Arrays.asList(22,23,24,25,26);

        List<List<Integer>> listOflist=Arrays.asList(num1,num2,num3);

        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
        System.out.println("\n list Before using flatMap");
        System.out.println(listOflist);

        System.out.println("\n list After using flatMap");
        // using flatMap to marge list of list
        List<Integer> collect = listOflist.stream().flatMap(integers -> integers.stream()).collect(Collectors.toList());
        System.out.println(collect);

        System.out.println("\n Array Before using flatMap");
        for (String[] strings : arrayofarray) {
            for (String string : strings) {

                System.out.print(string);;
            }
            System.out.println();

        }

        System.out.println("\n Array After using flatMap");
        List<String> collect1 = Arrays.stream(arrayofarray).flatMap(strings -> Arrays.stream(strings)).collect(Collectors.toList());
        System.out.println(collect1);


    }
}
