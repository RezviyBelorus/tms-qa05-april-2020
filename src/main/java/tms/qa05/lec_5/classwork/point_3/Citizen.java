package tms.qa05.lec_5.classwork.point_3;

public class Citizen implements Person {
    public String from() {
        return "Earth";
    }

    public final boolean hasFlag() {
        return true;
    }

    @Override
    public String toString() {
        return "simple Citizen";
    }
}
