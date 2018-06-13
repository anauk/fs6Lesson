package patterns.dao.entities;

import patterns.dao.dao.Identifiable;

public class Student implements Identifiable {
    private int id;
    private String name;
    private String group;

    public Student(int id, String name, String group) {
        this.id = id;
        this.name = name;
        this.group = group;
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

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    @Override
    public String toString() {
        return String.format("Student: [id:%d, name:%s, group:%s]", this.id, this.name, this.group);
    }
}
