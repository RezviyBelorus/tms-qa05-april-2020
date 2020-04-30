package tms.qa05.lec_5.classwork.point_1;

public class Audi implements Car {
    private boolean isOpen;

    @Override
    public void move() {
        if (isOpen) {
            System.out.println("Let's rock");
        } else {
            System.out.println("Open car");
        }
    }

    @Override
    public boolean openDoor() {
        if (!isOpen) {
            isOpen = true;
        } else {
            isOpen = false;
        }
        return isOpen;
    }

    public void moveToCharger() {
        System.out.println("Moving to charger");
    }

    static void lightOn() {
        System.out.println("Audi's lights");
    }
}
