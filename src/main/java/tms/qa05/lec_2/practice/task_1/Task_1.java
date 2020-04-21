package tms.qa05.lec_2.practice.task_1;

public class Task_1 {
    public static void main(String[] args) {
        int day = 1;

        double distance = 10;
        byte coef = 10;
        double totalDistance = distance;

        for (int i = 1; i < day; i++) {
            double nextDayDistance = distance * 1.1;

            totalDistance += nextDayDistance;

            // 10
            // 10*1.1 -> 11
            // 11*1.1 -> 12.1
            // 12.1*1.1 ->
        }

        System.out.println(totalDistance);

    }
}
