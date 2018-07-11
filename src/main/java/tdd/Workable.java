package tdd;

public interface Workable {
    void put (int key, String value);
    String get(int key);
    String joinValuesByKeys(int key1, int key2);
    boolean contains(int key);
}
