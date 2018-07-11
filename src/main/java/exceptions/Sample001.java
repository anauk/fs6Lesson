package exceptions;

import java.io.File;

public class Sample001 {
    public static void main(String[] args) {
        File f = new File("path", "name");
        Sorter001 sorter = new Sorter001(f);

        String data = sorter.data();
        System.out.println(data);
    }
}
