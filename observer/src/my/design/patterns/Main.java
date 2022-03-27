package my.design.patterns;

import my.design.patterns.observable.Weather;
import my.design.patterns.observer.MacDisplay;
import my.design.patterns.observer.PhoneDisplay;
import my.design.patterns.observer.TabletDisplay;

public class Main {

    public static void main(String[] args) {
        Weather weatherEng = new Weather();
        Weather weatherArm = new Weather();

        TabletDisplay tabletDisplay = new TabletDisplay();
        MacDisplay macDisplay = new MacDisplay();
        PhoneDisplay phoneDisplay = new PhoneDisplay();

        weatherArm.addObserver(tabletDisplay);
        weatherArm.addObserver(macDisplay);
        weatherArm.addObserver(phoneDisplay);

        weatherArm.setTemperature("35C");

        weatherArm.removeObserver(tabletDisplay);
        weatherArm.removeObserver(macDisplay);
        weatherEng.addObserver(tabletDisplay);
        weatherEng.addObserver(macDisplay);

        weatherEng.setTemperature("39C");
        weatherArm.setTemperature("41C");

    }
}
