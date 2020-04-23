package tms.qa05.lec_4.classwork.point_1;

public class StudentMain {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner();

        Student egorka = new Student("Egorka", 25);
        egorka.year = 1967;
        System.out.println(egorka);

        Student anton = new Student("Anton");
        System.out.println(anton);

        anton.setAge(27);
        anton.setGroup(666);

        String antonName = anton.getName();
        System.out.println(antonName);
        System.out.println(anton);

        Student.year = 2020;
        System.out.println(egorka);
    }
}
