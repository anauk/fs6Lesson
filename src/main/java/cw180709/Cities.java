package cw180709;

import cw180709.tools.NumberIt;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Cities {
    public static Map<Integer, City> read() throws IOException {
        HashMap<Integer, City> data = new HashMap<>();
        BufferedReader r = new BufferedReader(new FileReader(new File(NumberIt.PATH, NumberIt.OUT)));
        String line;
        while((line=r.readLine())!=null) {
            String[] s = line.split(":");
            int id = Integer.parseInt(s[0]);
            data.put(id, new City(id, s[1]));
        }
        return data;
    }
}
