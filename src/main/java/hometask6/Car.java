package hometask6;

public class Car extends Vieacle {

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
}
