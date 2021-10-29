package consoleapp;

import java.util.ArrayList;
import java.util.List;

import consoleapp.commands.Cowsay;
import consoleapp.commands.Exit;
import consoleapp.commands.Help;

public final class CommandManager {
    
    private static final List<Command> commandList = new ArrayList<>();

    public CommandManager() {
        commandList.add(new Help());
        commandList.add(new Cowsay());
        commandList.add(new Exit());
    }

    public List<Command> getCommandList() {
        return commandList;
    }

    public static Command getCommandByName(String name) {
        for (Command command : commandList) {
            if (name.equalsIgnoreCase(command.getName()))
                return command;
        }
        return null;
    }

}
