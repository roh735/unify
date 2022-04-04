package com.unify.utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigurationReader {

    private static Properties properties;

    static {
        try {
            String path = "src/test/configuration.properties";
            FileInputStream input = new FileInputStream(path);
            properties = new Properties();
            properties.load(input);
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    public static String getProperty(String keyName){return properties.getProperty(keyName);}
}
