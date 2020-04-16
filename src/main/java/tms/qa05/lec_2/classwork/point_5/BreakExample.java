package tms.qa05.lec_2.classwork.point_5;

public class BreakExample {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            if (i == 3) {
                break;
            }

            System.out.println(i);
        }

        System.out.println("After cycle");
    }
}
