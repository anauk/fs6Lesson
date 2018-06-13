package patterns.dao.old;

import patterns.dao.dao.Identifiable;
import patterns.dao.entities.Customer;

import java.util.List;

public interface CustomerDAOv0 {
    Customer get(int id);
    List<Identifiable> getAll();
    boolean insert(Customer c);
    boolean update(Customer c);
    boolean remove(Customer c);
}