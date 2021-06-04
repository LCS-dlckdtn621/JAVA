package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class IntArrayStreamTest {
    public static void main(String[] args){
        int[] arr = {1, 2, 3, 4, 5};
        Arrays.stream(arr).forEach(n -> System.out.println(n));

        List<String> list = new ArrayList<>();
        list.add("Tomas");
        list.add("Edward");
        list.add("Jack");

        Stream<String> stream = list.stream();
        stream.forEach(s->System.out.println(s));

        list.stream().sorted().forEach(s->System.out.println(s));
        list.stream().map(s->s.length()).forEach(s->System.out.println(s));
        list.stream().filter(s->s.length()>5).forEach(s->System.out.println(s));

    }
}
