package tms.qa05.lec_4.classwork.point_5;

public class PrivateEntity {
    private static PrivateEntity entity;

    private PrivateEntity() {
    }

    public static PrivateEntity instance() {
        if (entity == null) {
            entity = new PrivateEntity();
        }

        return entity;
    }

}
