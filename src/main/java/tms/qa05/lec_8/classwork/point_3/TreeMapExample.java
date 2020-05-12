package tms.qa05.lec_8.classwork.point_3;

import tms.qa05.lec_4.classwork.point_1.Student;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        Map<String, Student> studentMap = new TreeMap<>();
        Student phil = new Student("Phil", 27);
        Student egorka = new Student("Egorka", 45);

        studentMap.put("D", phil);
        studentMap.put("AA", egorka);
//        studentMap.put(null, null);

        System.out.println(studentMap);

    }
}
