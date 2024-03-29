package pkg_commands;
/**
 * Representations for all the valid command words for the game.
 * 
 * @author Michael Kolling and David J. Barnes
 * @version 2006.03.30
 */
public enum CommandWord
{
    // A value for each command word, plus one for unrecognised
    // commands.
     GO("go"), QUIT("quit"), HELP("help"), LOOK("look"),
     EAT("eat"), BACK("back"), TEST("test"), TAKE("take"), DROP("drop"), STUFF("inventaire"),
     USE("use"), ALEA("alea"), TALK("talk"),INVESTIGATE("investigate"), UNKNOWN("?");
    
     // The command string.
    private String commandString;
    
    /**
     * Initialise with the corresponding command word.
     * @param commandWord The command string.
     */
    CommandWord(String commandString)
    {
        this.commandString = commandString;
    }
    
    /**
     * @return The command word as a string.
     */
    public String toString()
    {
        return commandString;
    }
}