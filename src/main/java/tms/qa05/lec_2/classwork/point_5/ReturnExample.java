package tms.qa05.lec_2.classwork.point_5;

public class ReturnExample {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            if (i == 3) {
                return;
            }
            System.out.println(i);
        }

        // hello from github
        System.out.println("After cycle");
    }
}
