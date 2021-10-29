package consoleapp.commands;

import consoleapp.Command;
import consoleapp.Console;

public class Exit extends Command {

    public Exit() {
        super("exit", "bye", "exit program");
    }

    @Override
    public void execute(String[] parameters) {
        Console.exit = true;
    }
    
}
