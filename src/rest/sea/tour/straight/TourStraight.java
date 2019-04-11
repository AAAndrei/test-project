package rest.sea.tour.straight;

import rest.sea.tour.Tour;
import rest.sea.transport.BaseTransport;
import rest.sea.transport.TransportType;

public class TourStraight extends Tour {

    private final int radius;

    public TourStraight(BaseTransport baseTransport, int radius) {
        super(TransportType.RAILWAY, baseTransport);
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public int distance() {
        distance = (int)3.14 * radius * 180 / 180;
        return distance;
    }

    @Override
    public String toString() {
        return String.format("%-12s%-9s%13s%40s%12d%15.2f",
                getTransportType(),
                getBaseTransport(),
                getNameStart(),
                getNameFinish(),
                getDistance(),
                getTimeTour());
    }
}
