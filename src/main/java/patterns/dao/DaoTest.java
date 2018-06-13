package patterns.dao;

import patterns.dao.dao.Identifiable;
import patterns.dao.daoimpl.DAOHashMap;
import patterns.dao.entities.Customer;
import patterns.dao.entities.Student;
import patterns.dao.entities.Teacher;

import java.util.List;
import java.util.function.Consumer;

public class DaoTest {
    public static void main(String[] args) {
        DAOHashMap storage = new DAOHashMap();

        storage.insert(new Customer(1, "Alex"));
        storage.insert(new Customer(2, "Masha"));
        storage.insert(new Customer(3, "Dima"));
        storage.insert(new Customer(4, "Marina"));

        storage.insert(new Teacher(10, "Teacher #1", "Math"));
        storage.insert(new Teacher(11, "Teacher #2", "Music"));
        storage.insert(new Teacher(12, "Teacher #3", "Biology"));

        storage.insert(new Student(21, "Student #1", "KM-21"));
        storage.insert(new Student(22, "Student #2", "KM-23"));
        storage.insert(new Student(26, "Student #9", "KM-25"));

        List<Identifiable> all = storage.getAll();
        all.forEach(new Consumer<Identifiable>() {
            @Override
            public void accept(Identifiable identifiable) {
                System.out.println(identifiable);
            }
        });


    }
}
