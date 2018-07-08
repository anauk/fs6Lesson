package cw180709;

import cw180709.tools.NumberIt;

import java.io.*;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

public class Cities {
    private final Map<Integer, City> storage;

    public Cities() throws IOException {
        storage = read();
    }

    public Map<Integer, City> data() {
        return storage;
    }

    public int maxLength() {
        return storage.entrySet().stream()
                .map(e -> e.getValue().name().length()).max((o1, o2) -> o1-o2).get();
    }

    private Map<Integer, City> read() throws IOException {
        HashMap<Integer, City> data = new HashMap<>();
        BufferedReader r = new BufferedReader(new FileReader(new File(NumberIt.PATH, NumberIt.CITIES_OUT_FORMATTED)));
        while(r.ready()) {
            String[] s = r.readLine().split(":");
            int id = Integer.parseInt(s[0]);
            data.put(id, new City(id, s[1]));
        }
        return data;
    }
}
