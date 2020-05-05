package tms.qa05.lec_6.classwork.point_4;

public class PrivateClub implements Man {

    private final String name;

    public PrivateClub() {
        this("QA05");
    }

    private PrivateClub(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "PrivateClub{" +
            "name='" + name + '\'' +
            '}';
    }
}
