package tms.qa05.lec_1.classwork.point_5;

public class TypeCasting_1 {
    public static void main(String[] args) {
        byte b = 100;
        int i = 557;

        // 557 - 256 = 301 - 256 = 45
        b = (byte) i;

        System.out.println("i=" + i);
        System.out.println("b=" + b);

        double d = i;
        System.out.println("d = " + d);

        d = 300.99;
        b = (byte) d;

        System.out.println("b after: " + b);

    }

}
