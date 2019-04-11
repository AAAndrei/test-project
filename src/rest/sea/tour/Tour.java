package rest.sea.tour;

import rest.sea.transport.BaseTransport;
import rest.sea.transport.TransportType;

public class Tour {

    private final TransportType transportType;
    private final String nameStart = "Гомель";
    private final String nameFinish = "Одесса";
    private final BaseTransport baseTransport;

    protected double timeTour;
    protected int distance;

    public Tour(TransportType tourType, BaseTransport baseTransport) {
        this.baseTransport = baseTransport;
        this.transportType = tourType;
    }

    protected TransportType getTransportType() {
        return transportType;
    }

    protected String getNameStart() {
        return nameStart;
    }

    protected String getNameFinish() {
        return nameFinish;
    }

    protected BaseTransport getBaseTransport() {
        return baseTransport;
    }

    public double getTimeTour() {
        return timeTour;
    }

    public int getDistance() {
        return distance;
    }

    public double timeTour() {
        timeTour = (double)distance / getBaseTransport().getSpeed();
        return timeTour;
    }

    @Override
    public String toString() {
        return "Тур: " + transportType + " " + nameStart + " " + nameFinish + " " + timeTour + " " + baseTransport;
    }
}
