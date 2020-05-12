package tms.qa05.lec_8.classwork.point_4;

import java.util.HashSet;
import java.util.Set;

public class SetExample {
    public static void main(String[] args) {
        Set<Flat> flats = new HashSet<>();

        Flat flat_22 = new Flat(12, 3, 24.5);
        Flat flat_33 = new Flat(33, 2, 50.0);
        Flat flat_56 = new Flat(56, 1, 45.6);

        flats.add(flat_22);
        flats.add(flat_33);
        flats.add(flat_56);

        Flat biggerFlat_22 = new Flat(12, 3, 33.9);
        flats.add(biggerFlat_22);

        System.out.println(flats);
    }
}
