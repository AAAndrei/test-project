package rest.sea.data;

import rest.sea.tour.Tour;
import rest.sea.tour.arc.TourStraight;
import rest.sea.tour.straight.TourArc;
import rest.sea.tour.throughPoint.TourThroughPoint;
import rest.sea.transport.aircraft.Aircraft;
import rest.sea.transport.car.Car;
import rest.sea.transport.car.Minibus;
import rest.sea.transport.train.Fast;
import rest.sea.transport.train.Plackard;

public class DataProvider implements DataProviderServise {
    @Override
    public Tour[] generatTour() {

        TourStraight one = new TourStraight(new Aircraft(1400), 700);

        TourArc two = new TourArc(new Plackard(80), 350);

        TourArc three = new TourArc(new Fast(140), 350);

        TourThroughPoint four = new TourThroughPoint(new Minibus(60), 1, 350, 400);

        TourThroughPoint five = new TourThroughPoint(new Car(140), 1, 350, 400);

        Tour[] tours = {
                one, two, three, four, five,
                one, two, three, four, five,
        };
        return tours;
    }

    @Override
    public Tour[] descendingSort() {

        Tour[] decay = generatTour().clone();

        Tour temp;
        for (int i =0; i < decay.length - 1; ) {
            if (decay[i].getTimeTour() < decay[i + 1].getTimeTour()) {
                temp = decay[i];
                decay[i] = decay[i + 1];
                decay[i + 1] = temp;
                i = 0;
            } else {
                i++;
            }
        }
        return decay;
    }

    @Override
    public String durationTour(Tour[] tour) {
        int counter = 0;
        for (Tour o : tour) {
            if (o.getTimeTour() >= 25.0 / 60 && o.getTimeTour() <= 30.0 / 60) {
                counter++;
            }
        }
        return "Количество поездок от 25мин до 30 мин включительно: " + counter;
    }
}
