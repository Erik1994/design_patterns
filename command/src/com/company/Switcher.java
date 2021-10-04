package com.company;

import java.util.ArrayList;
import java.util.List;

//invoker
public class Switcher {
    private List<Command> commands = new ArrayList<>();

    public void addCommand(Command command) {
        commands.add(command);
    }

    public void executeCommands() {
        for(Command command: commands) {
            command.execute();
        }
    }

}
