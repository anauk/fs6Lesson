package io;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class StreamFromArrayList extends InputStream {
    private List<Integer> data;
    private int pointer;
    public StreamFromArrayList(ArrayList<Integer> integers) {
        data = integers;
    }

    @Override
    public int read() throws IOException {
        return pointer>=data.size() ? -1 : data.get(pointer++);
    }
}
