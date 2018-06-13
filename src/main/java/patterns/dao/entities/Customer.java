package patterns.dao.entities;

import patterns.dao.dao.Identifiable;

import java.io.InputStream;
import java.io.OutputStream;

public class Customer implements Identifiable {
    private int id;
    private String name;

    public Customer() {
    }

    public Customer(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return String.format("Customer: [id:%d, name:%s]", this.id, this.name);
    }
}
