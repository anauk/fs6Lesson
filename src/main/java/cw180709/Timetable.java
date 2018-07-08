package cw180709;

import cw180709.tools.NumberIt;
import cw180709.tools.TimetableGenerator;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Timetable {
    public Map<String, TimetableEntry> read() throws IOException {
        HashMap<String, TimetableEntry> data = new HashMap<>();
        BufferedReader r = new BufferedReader(new FileReader(new File(NumberIt.PATH, TimetableGenerator.TIMETABLE_OUT)));
        while(r.ready()) {
            String[] s = r.readLine().split(":");
            data.put(s[0], new TimetableEntry(s[0],
                            Integer.parseInt(s[1]),
                            Integer.parseInt(s[2]),
                            Integer.parseInt(s[3])));
        }
        return data;
    }
}
