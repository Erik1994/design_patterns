package com.company;

import java.util.ArrayList;
import java.util.List;

//invoker
public class Switcher {
    private Command command;

    public Switcher(Command command) {
        this.command = command;
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    public void executeCommand() {
        command.execute();
    }

    public void undoCommand() {
        command.undo();
    }

}
