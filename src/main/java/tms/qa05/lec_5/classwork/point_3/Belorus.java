package tms.qa05.lec_5.classwork.point_3;

public class Belorus extends Citizen {
    private boolean hasNewPresident;
    private final String famousObject;

    public Belorus(String famousObject) {
        this.famousObject = famousObject;
    }

    @Override
    public String from() {
        return "Belarus";
    }

    public boolean isHasNewPresident() {
        return hasNewPresident;
    }

    public void setHasNewPresident(boolean hasNewPresident) {
        this.hasNewPresident = hasNewPresident;
    }

    @Override
    public String toString() {
        return "Belorus{" +
            "hasNewPresident=" + hasNewPresident +
            ", famousObject='" + famousObject + '\'' +
            '}';
    }
}
