package tms.qa05.lec_5.classwork.point_3;

import java.util.Arrays;

public class FinalVarMain {
    public static void main(String[] args) {
        final int x = 0;
//        x = 99;

        final Citizen citizen = new Citizen();
        System.out.println(citizen.from());

        final Belorus belorus = new Belorus("Kurgan Slavi");
        System.out.println(belorus.isHasNewPresident());

        belorus.setHasNewPresident(true);
        System.out.println(belorus.isHasNewPresident());

        int[] array = {1, 2, 3};

        Person[] citizens = {
            new Citizen(),
            new Belorus("Braslavskie ozera")
        };

        System.out.println(Arrays.toString(citizens));
    }
}
