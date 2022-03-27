package my.design.patterns;

import my.design.patterns.observable.Weather;
import my.design.patterns.observer.MacDisplay;
import my.design.patterns.observer.PhoneDisplay;
import my.design.patterns.observer.TabletDisplay;

public class Main {

    public static void main(String[] args) {
        Weather weather = new Weather();

        TabletDisplay tabletDisplay = new TabletDisplay(weather);
        MacDisplay macDisplay = new MacDisplay(weather);
        PhoneDisplay phoneDisplay = new PhoneDisplay(weather);

        weather.setMeasurements("39C", "50%");
    }
}
