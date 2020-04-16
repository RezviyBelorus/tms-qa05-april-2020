package tms.qa05.lec_2.classwork.point_1;

public class IfExample {
    public static void main(String[] args) {
        int num_1 = 10;
        int maxAge = 9;
        int magicNumber = 666;

        if (num_1 < maxAge) {
            System.out.println(num_1 + " < " + maxAge);
            System.out.println("OOps!");
            if (num_1 == 3) {
                System.out.println("Woohoo, jack pot!");
            }
        } else if (num_1 == maxAge) {
            System.out.println(num_1 + " = " + maxAge);
        } else if (num_1 == magicNumber) {
            System.out.println("Welcome to hell");
        } else {
            System.out.println(num_1 + " > " + maxAge);
        }

    }
}
