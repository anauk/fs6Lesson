package exceptions;

import java.io.*;

public class Sorter001 {
    private final File f;

    public Sorter001(File f) {
        this.f = f;
    }

    public String data() {
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(this.f));
            return br.readLine();
        } catch (FileNotFoundException e) {
            //e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "";
    }
}
