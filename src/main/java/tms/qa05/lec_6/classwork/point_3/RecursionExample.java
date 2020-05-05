package tms.qa05.lec_6.classwork.point_3;

public class RecursionExample {
    public static void main(String[] args) {
        int result = calculate(0);

        System.out.println("result: " + result);
    }

    private static int calculate(int number) {
        if (number < 5) {
            return calculate(number + 1);
        }

        return number;
    }
}
