
import java.util.HashMap;
import java.util.Map;

public class ConfigurationManager {
    // Step 2.1: Create a private static instance of the ConfigurationManager class
    private static ConfigurationManager instance;

    // Step 2.2: Store configuration settings in a map
    private final Map<String, String> settings;

    // Step 2.3: Make the constructor private to prevent instantiation
    private ConfigurationManager() {
        settings = new HashMap<>();
        // Load default settings or from a configuration file
        settings.put("appName", "MyApplication");
        settings.put("version", "1.0.0");
        settings.put("logLevel", "INFO");
    }

    // Step 2.4: Provide a public method to get the instance of the ConfigurationManager class
    public static ConfigurationManager getInstance() {
        if (instance == null) {
            instance = new ConfigurationManager();
        }
        return instance;
    }

    // Step 2.5: Methods to get and set configuration settings
    public String getSetting(String key) {
        return settings.get(key);
    }

    public void setSetting(String key, String value) {
        settings.put(key, value);
    }
}
