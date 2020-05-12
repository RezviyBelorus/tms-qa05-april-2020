package tms.qa05.lec_8.classwork.point_3;

import tms.qa05.lec_4.classwork.point_1.Student;

import java.util.HashMap;
import java.util.Map;

public class WrongKeyExample {
    public static void main(String[] args) {
        Map<Student, Integer> wrongKeyExample = new HashMap<>();
        Student phil = new Student("Phil", 27);

        wrongKeyExample.put(phil, 333);
        System.out.println(wrongKeyExample);

        Integer integer = wrongKeyExample.get(phil);
        System.out.println("value:" + integer);

        phil.setAge(28);
        System.out.println("value after:" + wrongKeyExample.get(phil));

        System.out.println(wrongKeyExample);
    }
}
