package patterns.dao;

import java.util.List;

public interface DAO<T> {
    T get(int id);
    List<T> getAll();
    boolean insert(T c);
    boolean update(T c);
    boolean remove(T c);
}
