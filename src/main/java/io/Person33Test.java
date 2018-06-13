package io;

import java.util.ArrayList;

public class Person33Test {
    public static void main(String[] args) {
        Person33 p = new Person33(1, "Andy");
        p.dna();
        p.id();
        p.name();
        p.think();
        Animal00 a = new Animal00("Alice");
        Computer c = new Computer(0b0001);

        ArrayList<Person33> al_p33 = new ArrayList<>();
        ArrayList<Person00> al_p00 = new ArrayList<>();
        ArrayList<Thinkable00> al_th00 = new ArrayList<>();
        ArrayList<Nameable00> al_nm00 = new ArrayList<>();
        ArrayList<Animal00> al_anim = new ArrayList<>();
        ArrayList<Computer> al_comp = new ArrayList<>();

        al_nm00.add(p);
        al_p00.add(p);
        al_th00.add(p);
        al_p33.add(p);

        al_anim.add(a);
        al_nm00.add(a);

        al_comp.add(c);
        al_th00.add(c);
    }
}
