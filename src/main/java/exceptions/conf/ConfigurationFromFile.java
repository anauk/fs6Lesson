package exceptions.conf;

import java.io.*;

public class ConfigurationFromFile implements Configuration {
    private final File file;

    public ConfigurationFromFile(File file) {
        this.file = file;
    }

    @Override
    public String get() {
        try {
            return new BufferedReader(new FileReader(file)).readLine();
        } catch (IOException e) {
            throw new IllegalArgumentException(String.format(
                    "ConfigurationFromFile: file `%s` not found\n", this.file.toString()
            ));
        }
    }
}
