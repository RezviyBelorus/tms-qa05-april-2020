package tms.qa05.lec_6.classwork.point_1;

import java.util.Objects;

public class ClassStructure {
    private static final String MESSAGE = "MESSAGE";

    private final String FUEL = "ROCKET FUEL";

    private int age;
    private int width;

    public ClassStructure() {
    }

    public ClassStructure(int age, int width) {
        this.age = age;
        this.width = width;
    }

    public static String getMESSAGE() {
        return MESSAGE;
    }

    public String getFUEL() {
        return FUEL;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        ClassStructure that = (ClassStructure) o;
        return age == that.age && width == that.width && Objects.equals(FUEL, that.FUEL);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            FUEL,
            age,
            width);
    }

    @Override
    public String toString() {
        return "ClassStructure{" +
            "FUEL='" + FUEL + '\'' +
            ", age=" + age +
            ", width=" + width +
            '}';
    }
}
