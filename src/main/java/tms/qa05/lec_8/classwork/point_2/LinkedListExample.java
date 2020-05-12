package tms.qa05.lec_8.classwork.point_2;

import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<String> strings = new LinkedList<>();
        strings.add("A");
        strings.addFirst("B");
        strings.addLast("C");

        System.out.println(strings);

        System.out.println(strings.peekFirst());
        System.out.println(strings);

        System.out.println(strings.pollFirst());
        System.out.println(strings);

        System.out.println(strings.pop());
        System.out.println(strings);

        System.out.println(strings.pop());
        System.out.println(strings);

        System.out.println(strings.poll());
        System.out.println(strings);
    }
}
