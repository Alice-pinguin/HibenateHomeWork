package ua.goit.utils;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesLoader {

    private static final String properties_name = "application.properties";

    private static final Properties properties;

    static {
        properties = new Properties();
        try (InputStream inputStream = getInputStream(properties_name)) {
            properties.load(inputStream);
        } catch (IOException ex) {
            throw new RuntimeException("Invalid information");
        }
    }

    public static String getProperty (String name) {
        return properties.getProperty(name);
    }

    public static InputStream getInputStream(String propertiesFileName) {
        return PropertiesLoader.class.getClassLoader().getResourceAsStream(propertiesFileName);
    }

  }