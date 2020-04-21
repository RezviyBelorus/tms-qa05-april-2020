package tms.qa05.lec_3.classwork.point_5;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Lets sum smth");
        System.out.println("Enter number 1...");
        Integer num_1 = scanner.nextInt();

        System.out.println("Enter number 2...");
        Integer num_2 = scanner.nextInt();

        Integer sum = num_1 + num_2;
        System.out.println("Sum: " + sum);
    }
}
