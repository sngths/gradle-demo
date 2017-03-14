package com.tianxing.pattern.command;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by tianxing on 2017/3/14.
 */
public class Broker {
    private List<Command> commands = new ArrayList<>();

    public void takeCommand(Command command) {
        commands.add(command);
    }

    public void placeCommands() {
        commands.forEach(Command::execute);
        commands.clear();
    }
}
