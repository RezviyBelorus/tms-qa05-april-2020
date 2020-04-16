package tms.qa05.lec_1.classwork.point_6;

public class JavaOperators {
    public static void main(String[] args) {
        int num_1 = 8;
        int num_2 = 2;

        System.out.println(num_1 != num_2);

        int shiftLeft = 8 << 4;
        int shiftRight = 8 >> 4;

        System.out.println("shiftLeft: " + shiftLeft);
        System.out.println("shiftRight: " + shiftRight);

        int x = 0;

        System.out.println("x++: " + x);
        System.out.println("x: " + x);
        System.out.println("++x: " + ++x);

        System.out.println("x--: " + x--);
        System.out.println("--x: " + --x);

        x = 12 % 5;
        System.out.println("x%: " + x);

        double d = 0.2;
        double d2 = 0.7;

        System.out.println(d + d2);

        byte b = 1;
        short b2 = 2;
        int i = b2 + b;

        int y = 1;
        long l2 = 1;
        long i1 = y + l2;

        double v = d + l2;


    }
}
