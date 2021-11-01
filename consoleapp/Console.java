package consoleapp;

import java.util.Scanner;

public class Console {
    public static final CommandManager COMMAND_MANAGER = new CommandManager();

    private static Scanner sc = new Scanner(System.in);
    public static boolean exit = false;

    public static void console() {
        printWelcome(Main.NAME, Main.VERSION);

        while (!exit) {
            System.out.print("\n >>> ");
            
            String[] input = sc.nextLine().split("\\s+");
            String[] parameters;

            if (input.length > 1) {
                parameters = new String[input.length - 1];
                for (int i = 1; i < input.length; ++i) {
                    parameters[i - 1] = input[i];
                }
            } else {
                parameters = new String[]{""};
            }

            Command command = CommandManager.getCommandByName(input[0]);
            if (command == null) command = CommandManager.getCommandByAlias(input[0]);

            if (command != null) {
                command.execute(parameters);
            } else {
                System.out.println("Command \"" + input[0] + "\" not recognised.");
            }
        }
    }

    private static void printWelcome(String name, String version) {
        System.out.println(name + " " + version);
        
        System.out.println(" ~~~~~~~~~~~~~~~~ ");
    }
}
