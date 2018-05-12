//command decouples the object that invokes the operation from the one that knows how to perform it

public class main {
    public static void main(String[] args) {
        CommandManager commandManager = new CommandManager();
        commandManager.executeCommands();


           }
}