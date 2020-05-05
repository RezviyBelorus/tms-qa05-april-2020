package tms.qa05.lec_6.classwork.point_4;

import java.lang.reflect.Constructor;

public class PrivateClubPrivateConstructorMain {
    public static void main(String[] args) throws Exception {
        PrivateClub privateClub = new PrivateClub();
        System.out.println(privateClub);

//        PrivateClub alex = new PrivateClub("alex");

        Class<PrivateClub> privateClubClass = PrivateClub.class;

        Constructor<?>[] declaredConstructors = privateClubClass.getDeclaredConstructors();

        PrivateClub alex = null;

        for (Constructor<?> constructor : declaredConstructors) {
            Class<?>[] parameterTypes = constructor.getParameterTypes();

            for (Class<?> parameterType : parameterTypes) {
                if (String.class.getName().equals(parameterType.getName())) {
                    constructor.setAccessible(true);
                    alex = (PrivateClub) constructor.newInstance("Alex");
                }
            }
        }

        System.out.println("==Alex==");
        System.out.println(alex);
    }
}
