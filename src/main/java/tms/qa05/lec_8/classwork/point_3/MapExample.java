package tms.qa05.lec_8.classwork.point_3;

import tms.qa05.lec_4.classwork.point_1.Student;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapExample {
    public static void main(String[] args) {
        Map<Integer, Student> studentsMarks = new HashMap<>();

        Student alex = new Student("Alex", 32);
        Student egorka = new Student("Egorka", 333);

        studentsMarks.put(1, alex);
        studentsMarks.put(25, egorka);
        System.out.println(studentsMarks);

        studentsMarks.put(25, alex);
        System.out.println(studentsMarks);

        studentsMarks.remove(25, egorka);
        System.out.println(studentsMarks);

        Collection<Student> values = studentsMarks.values();
        System.out.println(values);

        Set<Integer> keySet = studentsMarks.keySet();
        System.out.println("keySet: " + keySet);

        studentsMarks.put(null, null);
        System.out.println(studentsMarks);
    }
}
