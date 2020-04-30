package tms.qa05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestMain {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>(Arrays.asList(1, 2, 3));

        integers.retainAll(Arrays.asList(1,0));

        System.out.println(integers);
    }
}
