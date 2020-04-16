package tms.qa05.lec_2.classwork.point_4;

public class WhileExample {
    public static void main(String[] args) {
        int x = Integer.valueOf(args[0]);

        while (x < 50) {
            System.out.println("x = " + x);

            x += 10;
        }

        int doWhile = 100;

        do {
            System.out.println("doWhile = " + doWhile);

            doWhile += 10;
        } while (doWhile < 150);

        System.out.println("End of the program");
    }
}
