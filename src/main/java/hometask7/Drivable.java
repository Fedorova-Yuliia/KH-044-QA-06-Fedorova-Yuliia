package hometask7;

public interface Drivable {

    String STOP = "STOP";

    default void makeStop() {
        System.out.println(STOP);
    }

    void makeLeft();
    void makeRight();
}
