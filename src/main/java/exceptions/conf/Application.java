package exceptions.conf;

import java.io.File;

public class Application {
    public static void main(String[] args) {
        Configuration c = new ConfigurationFromFile(new File("./src/main/java/exceptions/conf", "data.conf"));
        //Configuration c = new ConfigurationDefault();
        //Configuration c = new ConfigurationSmart();
        System.out.println(c.get());
    }
}
