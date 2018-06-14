package oop.patterns.dao.old;

import oop.patterns.dao.dao.Identifiable;
import oop.patterns.dao.entities.Customer;

import java.util.List;

public interface CustomerDAOv0 {
    Customer get(int id);
    List<Identifiable> getAll();
    boolean insert(Customer c);
    boolean update(Customer c);
    boolean remove(Customer c);
}