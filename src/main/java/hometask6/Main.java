package hometask6;

public class Main {

    public static void main(String[] args) {
        Vieacle bi = new Bycircle("purple");
        Vieacle moto = new Moto("White");
        Vieacle car1 = new Car("Orange");
        Car car2 = new Car("Hacky", 7);

        bi.ride();
        moto.ride();
        car1.ride();
        car2.ride();
        car2.ride(123);
    }
}
