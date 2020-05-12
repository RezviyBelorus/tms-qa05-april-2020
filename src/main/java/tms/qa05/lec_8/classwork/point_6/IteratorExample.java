package tms.qa05.lec_8.classwork.point_6;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class IteratorExample {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(2);
        integers.add(2);
        integers.add(1);
        integers.add(7);
        integers.add(3);

        System.out.println(integers);

        Iterator<Integer> iterator = integers.iterator();

        while (iterator.hasNext()) {
            Integer next = iterator.next();
            if (next % 2 == 0) {
                iterator.remove();
            }
        }

        System.out.println(integers);

        ListIterator<Integer> integerListIterator = integers.listIterator(integers.size());
        System.out.println("hasPrevious: " + integerListIterator.hasPrevious());
        System.out.println("previous: " + integerListIterator.previous());
        System.out.println("next: " + integerListIterator.hasNext());
    }
}
