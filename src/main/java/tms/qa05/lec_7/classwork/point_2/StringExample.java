package tms.qa05.lec_7.classwork.point_2;

public class StringExample {
    public static void main(String[] args) {
        String kirill = "Kirill";
        String kirill_2 = "Kirill";
        String egor = new String("Egor");
//        egor = egor.intern();
        String egor_2 = new String("Egor");
        egor_2 = egor_2.intern();

        System.out.println("==Kirill==");
        System.out.println(kirill == kirill_2);

        System.out.println("==Egor==");
        System.out.println(egor.equals(egor_2));

    }
}
