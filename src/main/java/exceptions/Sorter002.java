package exceptions;

import java.io.*;

public class Sorter002 {
    private final File f;

    public Sorter002(File f) {
        this.f = f;
    }

    public String data() throws FileNotFoundException, IOException {
        BufferedReader br = new BufferedReader(new FileReader(this.f));
        return br.readLine();
    }
}
