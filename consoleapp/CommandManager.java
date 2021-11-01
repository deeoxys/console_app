package consoleapp;

import java.util.ArrayList;
import java.util.List;

import consoleapp.commands.Cowsay;
import consoleapp.commands.Exit;

public final class CommandManager {
    
    private static final List<Command> commandList = new ArrayList<>();

    // is there a way we can loop through classes in package? TODO
    public CommandManager() {
        commandList.add(new Cowsay());
        commandList.add(new Exit());
    }

    public List<Command> getCommandList() {
        return commandList;
    }

    public static Command getCommandByName(String name) {
        if (name == "") return null;
        for (Command command : commandList) {
            if (name.equalsIgnoreCase(command.getName()))
            return command;
        }
        return null;
    }

    public static Command getCommandByAlias(String alias) {
        if (alias == "") return null;
        for (Command command : commandList) {
            if (alias.equalsIgnoreCase(command.getAlias()))
                return command;
        }
        return null;
    }
}
