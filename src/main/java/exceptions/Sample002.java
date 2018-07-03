package exceptions;

import java.io.File;
import java.io.IOException;

public class Sample002 {
    public static void main(String[] args) {
        File f = new File("path", "name");
        Sorter002 sorter = new Sorter002(f);

        try {
            String data = sorter.data();
            System.out.println(data);
        } catch (IOException e) {
            System.out.println("File not found 2");;
        }

    }
}
