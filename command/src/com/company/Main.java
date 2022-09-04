package com.company;

public class Main {

    public static void main(String[] args) {
        Light light = new Light();
        TurnOnCommand turnOnCommand = new TurnOnCommand(light);
        TurnOffCommand turnOffCommand = new TurnOffCommand(light);
        Switcher switcher = new Switcher(turnOnCommand);
        switcher.executeCommand();
        switcher.undoCommand();
        switcher.executeCommand();
        switcher.setCommand(turnOffCommand);
        switcher.executeCommand();
        switcher.undoCommand();
    }
}
