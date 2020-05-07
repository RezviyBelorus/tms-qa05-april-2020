package tms.qa05;

import java.util.Arrays;

public class TestMain {
    private static Integer[] array = {1, 2, 3};

    public static void main(String[] args) {
        Integer[] integers = get();


        integers[0] = 666;

        System.out.println(Arrays.asList(array));

        System.out.println(7 % array.length);
    }

    private static Integer[] get() {
        return array;
    }
}
