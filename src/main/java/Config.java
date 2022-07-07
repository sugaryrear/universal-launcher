import java.awt.*;
import java.io.File;


public class Config {
    /*
     * The name that appears on the task bar
     */
    public static final String NAME = "Universal Launcher";

    /*
     * Connection address of where to obtain the jar
     */
    public static final String URL = "DROPBOXURL";

    /*
     * The name of the jar to launch once downloaded
     */
    public static final String FILE_NAME = "JAFILE.jar";

    /*
     * The path to save the jar once it's downloaded.
     * Leaving it at user home is a safe bet,
     * change "example" to the name of your organization
     */
    public static String CLIENT_PATH = System.getProperty("user.home") + "/Desktop/ ";


    /*
     * Colors for the progress bar and progress text
     */
    public static final Color FOREGROUND = Color.BLACK;
    public static final Color TEXT_COLOR= Color.WHITE;
    public static final Color BACKGROUND = new Color(140, 17, 17);
}
