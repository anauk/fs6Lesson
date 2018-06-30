package datagenerator;

import java.io.IOException;
import java.util.Date;

public class DataProvider {
    private int currentTime() {
        return new Date().getHours();
    }

    public Iterable<TestData> get() {
        int time=currentTime();
        try {
            if (time>7 && time <=9) {
                return new WebPageDownloader("www.1.com");
            } else
            if (time>9 && time<18) {
                return new TestDataGeneratorLive("www.eldorado.com/prices");
            } else {
                return new TestDataGeneratorFileRemote("www.prom.ua/cache/data.xls");
            }
        } catch (SuperSmartNoInternetException e) {
            //e.printStackTrace();
        } catch (Exception_1 e) {

            e.printStackTrace();
        } catch (IOException e) {
            // server not response
            try {
                return new TestDataGeneratorFileLocal("data.txt");
            } catch (IOException e1) {
                return new TestDataGeneratorLocalData();
            }
        }
        return null;
    }
}
