package cw180914;

import java.io.*;

public class Reader102 {
    private static final String path = "src/main/java/cw180914";

    public static boolean isNumber(String s) {
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(!(c >= '0' && c<='9')) {
                return false;
            }
        }
        return true;

    }
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new FileReader(new File(path, "str2.txt")));
        BufferedWriter StringWritter = new BufferedWriter(new FileWriter(new File(path, "strings.txt")));
        BufferedWriter IntegerWritter = new BufferedWriter(new FileWriter(new File(path, "numbers.txt")));
while(br.ready()) {
    String s = br.readLine();
    if (isNumber(s)) {
        IntegerWritter.write(s);
        IntegerWritter.write("\n");

    } else {
        StringWritter.write(s);
        StringWritter.write("\n");
    }
}


        StringWritter.close();
        IntegerWritter.close();
        br.close();

    }
}
