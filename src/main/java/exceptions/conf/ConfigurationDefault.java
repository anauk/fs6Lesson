package exceptions.conf;

public class ConfigurationDefault implements Configuration {
    @Override
    public String get() {
        return "Default Value";
    }
}
