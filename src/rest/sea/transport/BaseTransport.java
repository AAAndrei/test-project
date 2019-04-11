package rest.sea.transport;

public abstract class BaseTransport {

    private final String name;
    private final int speed;

    public BaseTransport(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }

    public String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }

    @Override
    public String toString() {
        return  name;
    }
}
