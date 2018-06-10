package patterns.dao;

import java.util.List;

public class CustomerDAOSQL implements DAO<Customer>{
    @Override
    public Customer get(int id) {
        return null;
    }

    @Override
    public List<Customer> getAll() {
        return null;
    }

    @Override
    public boolean insert(Customer c) {
        return false;
    }

    @Override
    public boolean update(Customer c) {
        return false;
    }

    @Override
    public boolean remove(Customer c) {
        return false;
    }
}
