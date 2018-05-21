package oop;

import java.util.ArrayList;
import java.util.LinkedList;

public class OopTest {
    public static void main(String[] args) {
        ArrayList<Driveable> al = new ArrayList<>();
        al.add(new Auto());
        al.add(new Bus());
        al.add(new Bicycle());
        al.add(new Tesla());

        al.forEach(Driveable::drive);

        LinkedList<Smart> ll = new LinkedList<>();
        ll.add(new Tesla());
        ll.add(new Person());

        ll.forEach(Smart::think);

    }
}
