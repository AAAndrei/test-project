package rest.sea.data;

import rest.sea.tour.Tour;

public interface DataProviderServise {

    Tour[] generatTour();
    Tour[] descendingSort();
    String durationTour(Tour[] tour);

}
