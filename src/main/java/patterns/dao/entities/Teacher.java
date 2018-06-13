package patterns.dao.entities;

import patterns.dao.dao.Identifiable;

public class Teacher implements Identifiable {
    private int id;
    private String name;
    private String course;

    public Teacher(int id, String name, String course) {
        this.id = id;
        this.name = name;
        this.course = course;
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

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return String.format("Teacher: [id:%d, name:%s, course:%s]", this.id, this.name, this.course);
    }
}
