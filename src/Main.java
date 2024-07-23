public class Main {
    public static void main(String[] args) {
        // Step 3.1: Get the singleton instance of ConfigurationManager
        ConfigurationManager configManager = ConfigurationManager.getInstance();

        // Step 3.2: Use the ConfigurationManager to get and set configuration settings
        System.out.println("App Name: " + configManager.getSetting("appName"));
        System.out.println("Version: " + configManager.getSetting("version"));
        System.out.println("Log Level: " + configManager.getSetting("logLevel"));

        // Update a setting
        configManager.setSetting("logLevel", "DEBUG");

        // Verify the updated setting
        System.out.println("Updated Log Level: " + configManager.getSetting("logLevel"));
    }
}
