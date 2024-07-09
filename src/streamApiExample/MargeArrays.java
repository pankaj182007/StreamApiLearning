package streamApiExample;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MargeArrays {
    public static void main(String[] args) {

    int[] num = new int[]{1,2,3,4};
    int[] num2 = new int[]{5,6,7,8,9};
        int[] array = Stream.of(num2, num).flatMapToInt(ints -> Arrays.stream(ints)).toArray();
        Object[] margAarray1 = Stream.of(Arrays.asList(num), Arrays.asList(num2)).flatMap(ints -> ints.stream()).toArray();
        System.out.println("Firat Array : "+Arrays.deepToString(new int[][]{num}));
        System.out.println("Second Array : "+Arrays.deepToString(new int[][]{num2}));

        System.out.println("Merged Array : "+Arrays.deepToString(new int[][]{array}));
        System.out.println("Merged Array using other method : "+Arrays.deepToString(margAarray1));


    }
}
