import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMain1 {
    public static void main(String[] args) {
        //Create a list and filter all even numbers fom list
        //Without using Stream Api

        List<Integer> list1 =new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);
        list1.add(6);
        list1.add(7);
        list1.add(8);
        list1.add(9);
        list1.add(10);

        List<Integer> list2 = Arrays.asList(1, 23, 3, 4, 56, 6, 30, 8, 35);
       // System.out.println(list1 +"\n"+list2);

        // even numbers from list1 to evenList Without using Stream Api
        List<Integer> evenList=new ArrayList<>();

        for (int i:list1   )
        {
         if(i%2==0)
         {
            evenList.add(i);
         }
        }
        System.out.println("\nfind even numbers from list1 to evenList Without using Stream Api" +
                           "\noriginal list"+list1+"\nEven numbers : "+evenList);



        //with using streamApi
        evenList=list1.stream().filter(i->i%2==0).collect(Collectors.toList());
        System.out.println("\nfind even numbers from list1 to evenList using Stream Api" +
                           "\n original list"+list1+"\nEven numbers : "+evenList);

        //find numbers greater the 20 from list2 using streamApi
        List<Integer> collect = list2.stream().filter(i -> i > 20).collect(Collectors.toList());
        System.out.println("\nfind numbers greater the 20 from list2 using streamApi" +
                             "\noriginal list"+list2+"\n new list"+collect);


    }
}
