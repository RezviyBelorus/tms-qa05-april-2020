package tms.qa05.lec_8.classwork.point_2;

import java.util.ArrayList;
import java.util.LinkedList;

public class ListExample {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("A");

        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("B");

        arrayList.addAll(linkedList);
//        System.out.println(arrayList);

        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }
    }
}
