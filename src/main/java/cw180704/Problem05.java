package cw180704;

import java.io.*;

public class Problem05 {
    public static void main(String[] args) throws IOException {
        System.out.println(reader());
    }


    public static String reader() throws IOException {
        return new BufferedReader(new FileReader(new File("1.txt"))).readLine();
    }
}
