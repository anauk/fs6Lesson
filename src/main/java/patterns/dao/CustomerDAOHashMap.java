package patterns.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CustomerDAOHashMap implements DAO<Customer> {
    private final HashMap<Integer, Customer> map = new HashMap<>();

    @Override
    public Customer get(int id) {
        return map.get(id);
    }

    @Override
    public List<Customer> getAll() {
        return map.entrySet().stream().map(new Function<Map.Entry<Integer, Customer>, Customer>() {
            @Override
            public Customer apply(Map.Entry<Integer, Customer> item) {
                return item.getValue();
            }
        }).collect(Collectors.toList());
    }

    @Override
    public boolean insert(Customer c) {
        map.put(c.getId(), c);
        return true;
    }

    @Override
    public boolean update(Customer c) {
        map.put(c.getId(), c);
        return true;
    }

    @Override
    public boolean remove(Customer c) {
        map.remove(c.getId());
        return true;
    }
}
