package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class configReader {
    public static String read(String key) throws IOException {
        FileInputStream fis = new FileInputStream(constant.Constants.CONFIG_FILE_PATH);
        Properties properties = new Properties();
        properties.load(fis);
        return properties.getProperty(key);
    }
}
