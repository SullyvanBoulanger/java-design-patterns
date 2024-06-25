package fr.diginamic.singleton;

import java.util.ResourceBundle;

public class Configuration {

    private ResourceBundle configurationBundle;

    private Configuration() {
        initConfigurationBundle();
    }

    public static Configuration getInstance() {
        return SingletonHelper.CONFIGURATION_INSTANCE;
    }

    public String getString(String key) {
        return configurationBundle.getString(key);
    }

    private void initConfigurationBundle() {
        configurationBundle = ResourceBundle.getBundle("configuration");
    }

    private static class SingletonHelper {
        private static final Configuration CONFIGURATION_INSTANCE = new Configuration();
    }
}
