package tms.qa05.lec_4.classwork.point_6;

import tms.qa05.lec_4.classwork.point_1.Student;

public class EqualsHashcodeExample {
    public static void main(String[] args) {
        Student student = new Student("Access", 25);
        Student student_2 = new Student("Access", 25);
        Student.year = 2019;

        System.out.println("equals: " + student.equals(student_2));
        /*
        hashCode_1 == hashCode_2 -> equals_1 может быть равен equals_2
        equals_1 == equals_2 -> hashCode_1 == hashCode_2
         */
    }
}
