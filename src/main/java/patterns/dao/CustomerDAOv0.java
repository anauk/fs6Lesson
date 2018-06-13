package patterns.dao;

import java.util.List;

public interface CustomerDAOv0 {
    Customer get(int id);
    List<Customer> getAll();
    boolean insert(Customer c);
    boolean update(Customer c);
    boolean remove(Customer c);
}