package consoleapp.commands;

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

        System.out.println(" ________________________________\n" +
                "< " + message + " >\n" +
                " --------------------------------\n" +
                "        \\   ^__^\n" +
                "         \\  (oo)\\_______\n" +
                "            (__)\\       )\\/\\\n" +
                "                ||----w |\n" +
                "                ||     ||");
        
    }
    
}
