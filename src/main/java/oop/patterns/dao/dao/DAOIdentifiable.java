package oop.patterns.dao.dao;

import java.util.List;

public interface DAOIdentifiable<T> {
    T get(int id);
    List<T> getAll();
    boolean insert(T c);
    boolean update(T c);
    boolean remove(T c);
}
