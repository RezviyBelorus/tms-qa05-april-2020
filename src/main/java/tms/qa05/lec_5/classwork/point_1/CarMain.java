package tms.qa05.lec_5.classwork.point_1;

public class CarMain {
    public static void main(String[] args) {
        Car car = new Audi();

        car.openDoor();
        car.move();
//        car.moveToCharger();

        Car bmw = new BMW();
        bmw.move();
    }
}
