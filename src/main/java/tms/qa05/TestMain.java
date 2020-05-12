package tms.qa05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class TestMain {
    private static Integer[] array = {1, 2, 3};

    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
//        integers.add(0);
        integers.add(2);
//        integers.add(3);
//        integers.add(4);
        integers.add(3);


        integers.contains(2);
        List<Double> doubles = Arrays.asList(1.0, 2.0);

        LinkedList<String> ll = new LinkedList<>();
        ll.add("A");
        ll.add("B");
        ll.add("C");

        ll.peekFirst();
        ll.peekLast();

        System.out.println(ll.poll());
        System.out.println(ll.peek());

        System.out.println(ll);


        Set<Integer> set = new HashSet<>();
        set.add(2);
        set.add(2);
    }

    private static void addAll(List<Number> from, List<? extends Number> to) {
        from.addAll(to);
    }
    private static Integer[] get() {
        return array;
    }
}
