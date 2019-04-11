package rest.sea.tour.throughPoint;

import rest.sea.tour.Tour;
import rest.sea.transport.BaseTransport;
import rest.sea.transport.TransportType;

public class TourThroughPoint extends Tour {

    private final String nameThroughPoint = "Киев";
    private final int stopTime;
    private final int firstDistance;
    private final int secondDistance;

    public TourThroughPoint(BaseTransport baseTransport, int stopTime, int firstDistance, int secondDistance) {
        super(TransportType.GROUND, baseTransport);
        this.stopTime = stopTime;
        this.firstDistance = firstDistance;
        this.secondDistance = secondDistance;
        distance = firstDistance + secondDistance;
    }

    public int getStopTime() {
        return stopTime;
    }

    public int getFirstDistance() {
        return firstDistance;
    }

    public int getSecondDistance() {
        return secondDistance;
    }

    public String getNameThroughPoint() {
        return nameThroughPoint;
    }

    @Override
    public double getTimeTour() {
        timeTour = ((double) distance / getBaseTransport().getSpeed()) + stopTime;
        return timeTour;
    }

    @Override
    public String toString() {
        return String.format("%-12s%-11s%11s%10s%13d%17s%12d%15.2f",
                getTransportType(),
                getBaseTransport(),
                getNameStart(),
                getNameThroughPoint(),
                getStopTime(),
                getNameFinish(),
                getDistance(),
                getTimeTour());
    }
}
