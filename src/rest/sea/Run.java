package rest.sea;

import rest.sea.data.DataProvider;
import rest.sea.data.DataProviderServise;

public class Run {
    public static void main(String[] args) {
        System.out.println("TYPE" + "\t\t" + "TRANSPORT" + "\t\t" + "START"  + "\t\t" + "STOP" + "\t\t" + "TIME STOP" + "\t\t" + "FINISH" + "\t\t" + "DISTANCE" + "\t\t" + "TIME TOUR");
        System.out.println();
        DataProviderServise dataProviderServise = new DataProvider();
        for (Object o : dataProviderServise.generatTour()) {
            System.out.println(o.toString());
        }
        System.out.println();
        for (Object o : dataProviderServise.descendingSort()) {
            System.out.println(o);
        }
        System.out.println();
        System.out.println("Самая быстрая поездка");
        System.out.println(dataProviderServise.descendingSort()[dataProviderServise.descendingSort().length - 1]);
        System.out.println();
        System.out.println(dataProviderServise.durationTour(dataProviderServise.descendingSort()));
    }
}
