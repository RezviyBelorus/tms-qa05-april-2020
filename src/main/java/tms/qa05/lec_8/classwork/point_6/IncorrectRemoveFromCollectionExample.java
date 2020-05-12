package tms.qa05.lec_8.classwork.point_6;

import java.util.ArrayList;
import java.util.List;

public class IncorrectRemoveFromCollectionExample {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(2);
        integers.add(2);
        integers.add(1);
        integers.add(3);

        System.out.println(integers);

        for (int i = 0; i < integers.size(); i++) {
            Integer integer = integers.get(i);
            if (integer % 2 == 0) {
                integers.remove(i);
            }
        }

        System.out.println(integers);

        for (Integer integer : integers) {
            if (integer % 2 == 0) {
                integers.remove(integer);
            }
        }
    }
}
