package tms.qa05.lec_2.classwork.point_2;

public class SwitchExample {
    public static void main(String[] args) {
        int month = 43;

//        String stringMonth = args[0];
//        Integer month = Integer.valueOf(stringMonth);

        switch (month) {
            case 2:
                System.out.println("Current month: February");
                break;
            case 8:
                System.out.println("Current month: August");
                break;
            case 4:
                System.out.println("Current month: April");
                break;
            default:
                System.out.println("Error, wrong month");
                break;
        }
    }
}
