package config;

import java.util.HashMap;
import java.util.Map;

// Patrón Singleton
public class ConfigurationManager {
    private static ConfigurationManager instance = null;
    private Map<String, String> config;

    private ConfigurationManager() {
        config = new HashMap<>();
    }

    public static ConfigurationManager getInstance() {
        if (instance == null) {
            instance = new ConfigurationManager();
        }
        return instance;
    }

    public void set(String key, String value) {
        config.put(key, value);
    }

    public String get(String key) {
        return config.get(key);
    }

    public String getPrinterType() {
        return get("printer");
    }
}
