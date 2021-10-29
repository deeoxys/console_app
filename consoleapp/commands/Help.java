package consoleapp.commands;

import consoleapp.Command;

public class Help extends Command {

    public Help() {
        super("help", "h", "show help menu");
    }

    @Override
    public void execute(String[] parameters) {
        System.out.println(" ~~~~~~ Help Menu ~~~~~~");

        System.out.println("hello world!");

        System.out.println(" ~~~~~~~~~~~~~~~~~~ ");
    }
}
