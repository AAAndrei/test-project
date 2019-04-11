package rest.sea.tour.arc;

import rest.sea.tour.Tour;
import rest.sea.transport.BaseTransport;
import rest.sea.transport.TransportType;

public class TourArc extends Tour {

    public TourArc(BaseTransport baseTransport, int distance) {
        super(TransportType.AERIAL, baseTransport);
        this.distance = distance;
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
