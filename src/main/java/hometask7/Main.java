package hometask7;

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

        Drivable drBi = bi;
        Drivable drMo = moto;
        Drivable drCar = car1;

        drBi.makeStop();
        drMo.makeStop();
        drCar.makeStop();

        drBi.makeRight();
        drMo.makeLeft();
        drCar.makeLeft();


        ServiceTech serviceTechCar = car2;
        serviceTechCar.showCheckList();
        System.out.println("Voltage " + serviceTechCar.getVoltage());
        System.out.println("Fuel level " + serviceTechCar.getFuelLevel());
    }
}
