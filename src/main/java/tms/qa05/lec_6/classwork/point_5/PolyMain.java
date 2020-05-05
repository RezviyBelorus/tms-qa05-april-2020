package tms.qa05.lec_6.classwork.point_5;

import tms.qa05.lec_6.classwork.point_4.Man;
import tms.qa05.lec_6.classwork.point_4.PrivateClub;

public class PolyMain {
    public static void main(String[] args) {
        PrivateClub privateClub = new PrivateClub();
        showName(privateClub);

        Woman svetlana = new Woman("Svetlana");
        showName(svetlana);
    }

    private static void showName(Man man) {
        System.out.println("Man's name is " + man.getName());
    }
}
