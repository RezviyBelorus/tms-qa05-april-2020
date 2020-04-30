package tms.qa05.lec_5.classwork.point_1;

public class BMW implements Car {
    @Override
    public void move() {
        System.out.println("BMW is running");
    }
    @Override
    public boolean openDoor() {
        return false;
    }

    @Override
    public void sayHi() {
        System.out.println("Hello from BMW");
    }
}
