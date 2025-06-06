/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package config;

/**
 *
 * @author ivand
 */
public class ConfigurationManager {
    private static ConfigurationManager instance;
    private String printerType = "PDF";

    private ConfigurationManager() {}

    public static synchronized ConfigurationManager getInstance() {
        if (instance == null)
            instance = new ConfigurationManager();
        return instance;
    }

    public String getPrinterType() {
        return printerType;
    }

    public void setPrinterType(String type) {
        printerType = type;
    }
}
