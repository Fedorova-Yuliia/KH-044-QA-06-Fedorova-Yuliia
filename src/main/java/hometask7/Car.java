package hometask7;

public class Car extends Vieacle implements ServiceTech {

    public Car(String color) {
        super(color);
        super.capacity = 4;
    }

    public Car(String color, int capacity) {
        super(color);
        super.capacity = capacity;
    }

    @Override
    public void ride() {
        System.out.println("Ride with powerful engine!");
    }

    public void ride(int fuelQuality) {
        System.out.println("Ride with like a rocket!");
    }

    @Override
    public void makeLeft() {
        System.out.println("Turn 2 front whiles left");
    }

    @Override
    public void makeRight() {
        System.out.println("Turn 2 front whiles right");
    }

    @Override
    public double getVoltage() {
        return 14.4;
    }

    @Override
    public int getFuelLevel() {
        return 95;
    }
}
