package hometask7;

public interface ServiceTech {

    default void showCheckList() {
        System.out.println("Check: tire pressure, fuel level, voltage level");
    }

    double getVoltage();
    int getFuelLevel();
}
