package hometask7;

public class Bycircle extends Vieacle {

    public Bycircle(String color) {
        super(color);
        super.capacity = 1;
    }

    @Override
    public void ride() {
        System.out.println("Ride with pedals power!");
    }

    @Override
    public void makeLeft() {
        System.out.println("Turn the front while left");
    }

    @Override
    public void makeRight() {
        System.out.println("Turn the front while right");
    }
}
