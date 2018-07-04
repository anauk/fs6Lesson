package tdd;

import java.util.HashMap;

public class WorkableImpl implements Workable {
    private final HashMap<Integer, String> storage = new HashMap<>();

    @Override
    public void put(int key, String value) {
       storage.put(key, value);
    }

    @Override
    public String get(int key) {
        return storage.get(key);
    }

    @Override
    public String joinValuesByKeys(int key1, int key2) {
        return String.format("%s%s",
                storage.get(key1),
                storage.get(key2));
    }

    @Override
    public boolean contains(int key) {
        return storage.containsKey(key);
    }
}
