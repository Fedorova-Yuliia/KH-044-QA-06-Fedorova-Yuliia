package hometask7;

public abstract class Vieacle implements Drivable {
    protected String color;
    protected int capacity;

    public Vieacle(String color) {
        this.color = color;
    }

    public abstract void ride();
}
