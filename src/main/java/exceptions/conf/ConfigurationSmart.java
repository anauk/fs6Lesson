package exceptions.conf;

import java.io.File;

public class ConfigurationSmart implements Configuration {
    @Override
    public String get() {
        try {
            return new ConfigurationFromFile(new File("./1src/main/java/exceptions/conf", "data.conf")).get();
        } catch (IllegalArgumentException e) {
            return new ConfigurationDefault().get();
        }
    }
}
