package oop.patterns.dao.daoimpl;

import oop.patterns.dao.dao.DAOIdentifiable;
import oop.patterns.dao.dao.Identifiable;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DAOHashMap implements DAOIdentifiable<Identifiable> {
    private final HashMap<Integer, Identifiable> map = new HashMap<>();

    @Override
    public Identifiable get(int id) {
        return map.get(id);
    }

    @Override
    public List<Identifiable> getAll() {
        return map.entrySet().stream().map(new Function<Map.Entry<Integer, Identifiable>, Identifiable>() {
            @Override
            public Identifiable apply(Map.Entry<Integer, Identifiable> item) {
                return item.getValue();
            }
        }).collect(Collectors.toList());
    }

    @Override
    public boolean insert(Identifiable c) {
        map.put(c.getId(), c);
        return true;
    }

    @Override
    public boolean update(Identifiable c) {
        map.put(c.getId(), c);
        return true;
    }

    @Override
    public boolean remove(Identifiable c) {
        map.remove(c.getId());
        return true;
    }
}
