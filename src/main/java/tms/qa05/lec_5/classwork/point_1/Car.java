package tms.qa05.lec_5.classwork.point_1;

public interface Car {
    String NAME = "Car";

    void move();

    boolean openDoor();

    default void sayHi() {
        System.out.println("Hello from Car");
    }

    static void lightOn() {
        System.out.println("Is it night already?");
    }
}
