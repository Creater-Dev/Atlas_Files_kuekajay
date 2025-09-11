public class Main {
    public static void main(String[] args) {
        Task02_SingletonDPConfigManager config = Task02_SingletonDPConfigManager.getConfigManagerInstance();

        String appName = config.getProperty("app.name");
        String appVersion = config.getProperty("app.version");

        System.out.println("Application Name: " + appName);
        System.out.println("Application Version: " + appVersion);
    }
}
