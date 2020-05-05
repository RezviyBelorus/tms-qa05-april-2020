package tms.qa05.lec_6.classwork.point_4;

import java.lang.reflect.Field;

public class PrivateClubChangeFieldValueMain {
    public static void main(String[] args) throws Exception {
        PrivateClub alex = new PrivateClub();

        System.out.println(alex);
        Class<? extends PrivateClub> privateClubClass = alex.getClass();

        Field name = privateClubClass.getDeclaredField("name");
        name.setAccessible(true);
        name.set(alex, "Georgiy");

        System.out.println(alex);
    }
}
