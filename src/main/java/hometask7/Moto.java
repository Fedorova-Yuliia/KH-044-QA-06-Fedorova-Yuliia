package hometask7;

public class Moto extends Bycircle {

    public Moto(String color) {
        super(color);
        super.capacity = 2;
    }

    @Override
    public void ride() {
        System.out.println("Ride with engine!");
    }
}
