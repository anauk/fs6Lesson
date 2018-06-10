package tests33;

import java.io.IOException;
import java.util.Iterator;

public class WebPageDownloader implements Iterable<TestData> {
    private final String address;

    public WebPageDownloader(String address) throws Exception_1, IOException {
        this.address = address;
        boolean noIternet=true;
        if (noIternet) throw new Exception_1("no internet");
    }

    String get() throws IOException {
        Connect c = new Connect(address);
        String s = c.get();
        if (c.status()!=0) {
            throw new IOException("server not respond");
        }
        return s;
    }

    @Override
    public Iterator<TestData> iterator() {
        return null;
    }
}
