package com.unify.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Environment {

    public static final String URL;
    public static final String BASE_URL;
    public static final String DB_USERNAME;
    public static final String DB_PASSWORD;
    public static final String DB_URL;
    public static final String USER_EMAIL;
    public static final String USER_PASSWORD;

    static { //runs once in beginning when we use the class- static block
        //class to read from .properties files
        Properties properties = null;
        String environment = System.getProperty("env") != null ? System.getProperty("env") : ConfigurationReader.getProperty("env");
        //String environment = ConfigurationReader.get("environment");

        try {

            String path = System.getProperty("user.dir") + "/src/test/resources/env/" + environment + ".properties";

            FileInputStream input = new FileInputStream(path);
            properties = new Properties();
            properties.load(input);
            input.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        URL = properties.getProperty("url");
        BASE_URL = properties.getProperty("base_url");
        DB_USERNAME = properties.getProperty("dbUsername");
        DB_PASSWORD = properties.getProperty("dbPassword");
        DB_URL = properties.getProperty("dbUrl");
        USER_EMAIL = properties.getProperty("user_email");
        USER_PASSWORD = properties.getProperty("user_password");


    }




}
