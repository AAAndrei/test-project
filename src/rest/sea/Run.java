package rest.sea;

import rest.sea.data.DataProvider;

public class Run {
    public static void main(String[] args) {
        System.out.println("TYPE" + "\t\t" + "TRANSPORT" + "\t\t" + "START"  + "\t\t" + "STOP" + "\t\t" + "TIME STOP" + "\t\t" + "FINISH" + "\t\t" + "DISTANCE" + "\t\t" + "TIME TOUR");
        System.out.println();
        DataProvider dataProvider = new DataProvider();
        for (Object o : dataProvider.generatTour()) {
            System.out.println(o.toString());
        }
        System.out.println();
        for (Object o : dataProvider.arrayDecay()) {
            System.out.println(o);
        }
        System.out.println();
        System.out.println("Самая быстрая поездка");
        System.out.println(dataProvider.arrayDecay()[9]);
        System.out.println();
        System.out.println(dataProvider.durationTour(dataProvider.arrayDecay()));
    }
}
