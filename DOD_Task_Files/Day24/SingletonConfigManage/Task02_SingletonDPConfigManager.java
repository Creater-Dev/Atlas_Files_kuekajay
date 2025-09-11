import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Task02_SingletonDPConfigManager {
    private static Task02_SingletonDPConfigManager ConfigManagerInstance;
    private Properties properties;

    private Task02_SingletonDPConfigManager() {
        properties = new Properties();
        try (InputStream input = getClass().getClassLoader().getResourceAsStream("config.prop")) {
            if (input == null) {
                System.out.println("we cant find config properties");
                return;
            }
            properties.load(input);
        } catch (IOException ioexp) {
            ioexp.printStackTrace();
        }
    }

    public String getProperty(String key) {

        return properties.getProperty(key);
    }

    public static synchronized Task02_SingletonDPConfigManager getConfigManagerInstance() {
        if (ConfigManagerInstance == null) {
            ConfigManagerInstance = new Task02_SingletonDPConfigManager();
        }
        return ConfigManagerInstance;
    }

}
