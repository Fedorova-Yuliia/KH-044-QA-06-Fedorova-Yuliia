package hometask6;

public class Bycircle extends Vieacle {

    public Bycircle(String color) {
        super(color);
        super.capacity = 1;
    }

    @Override
    public void ride() {
        System.out.println("Ride with pedals power!");
    }
}
