package hometask6;

public abstract class Vieacle {
    protected String color;
    protected int capacity;

    public Vieacle(String color) {
        this.color = color;
    }

    public abstract void ride();
}
