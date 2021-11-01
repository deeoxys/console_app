package consoleapp.commands;

import java.util.Arrays;

import consoleapp.Command;

public class Cowsay extends Command {

    public Cowsay() {
        super("cowsay", "moo", "moo");
    }

    @Override
    public void execute(String[] parameters) {
        String message = "";
        for (String parameter: parameters) {
            message += " " + parameter;
        }

        String top = " ";
        String bot = " ";
        for (int i = 0; i < message.length() + 2; i++) {
            top += "_";
            bot += "-";
        }
        top += "\n";
        bot += "\n";

        System.out.println(top +
                "< " + message + " >\n" +
                bot +
                "        \\   ^__^\n" +
                "         \\  (oo)\\_______\n" +
                "            (__)\\       )\\/\\\n" +
                "                ||----w |\n" +
                "                ||     ||");


    }
    
}
