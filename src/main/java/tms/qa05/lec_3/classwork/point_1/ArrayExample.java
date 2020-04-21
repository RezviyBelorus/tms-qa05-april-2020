package tms.qa05.lec_3.classwork.point_1;

import java.util.Arrays;

public class ArrayExample {
    public static void main(String[] args) {
        int[] array = new int[14];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
        }

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        System.out.println("==Init Array==");
        int[] initArray = {11, 22, 33};
        for (int i = 0; i < initArray.length; i++) {
            System.out.println(initArray[i]);
        }

        System.out.println("==String Array==");
        String[] stringArray = new String[4];
        stringArray[3] = "Apple";

        for (int i = 0; i < stringArray.length; i++) {
            System.out.println(stringArray[i]);
        }

        for (String s : stringArray) {
            s = s + "A";
        }


        // O(n2)
        System.out.println(Arrays.toString(stringArray));
    }
}
