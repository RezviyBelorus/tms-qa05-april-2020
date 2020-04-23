package tms.qa05.lec_4.classwork.point_5;

import tms.qa05.lec_4.classwork.point_1.Student;

public class AccessMain {
    public static void main(String[] args) {
        Student student = new Student("Access");
        Student student_2 = new Student("Access");
        Student.year = 2019;

        System.out.println(student == student_2);

        PrivateEntity instance = PrivateEntity.instance();
        PrivateEntity instance1 = PrivateEntity.instance();
        System.out.println("instance:" + (instance == instance1));

    }
}
