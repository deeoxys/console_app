package consoleapp;
public abstract class Command {
    private final String NAME;
    private final String ALIAS;
    private final String DESCRIPTION;

    public Command(String name, String alias, String description) {
        this.NAME = name;
        this.ALIAS = alias;
        this.DESCRIPTION = description;
    }
    

    public String getName() {
        return this.NAME;
    }


    public String getAlias() {
        return this.ALIAS;
    }

    public String getDescription() {
        return this.DESCRIPTION;
    }
    
    public abstract void execute(String[] parameters);
}
