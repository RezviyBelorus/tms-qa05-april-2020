package tms.qa05.lec_8.classwork.point_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>(2);
        strings.add("A");
        strings.add(0, "B");

        System.out.println(strings);
        strings.add(0, "C");
        strings.add( "D");

        System.out.println(strings);
        System.out.println(strings.size());

        List<String> toAdd = Arrays.asList("My new collection", "Happy end");

        strings.addAll(toAdd);
        strings.remove(strings.size()-1);

        System.out.println(strings);

        strings.retainAll(toAdd);
        System.out.println(strings);
        strings.set(0, "Hello from set");
        System.out.println(strings);

    }
}
