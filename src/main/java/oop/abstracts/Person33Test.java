package oop.abstracts;

import oop.abstracts.interfaces.Identifable00;
import oop.abstracts.interfaces.Nameable00;
import oop.abstracts.interfaces.AbstractPerson;
import oop.abstracts.interfaces.Thinkable00;

import java.util.ArrayList;

public class Person33Test {
    public static void main(String[] args) {
        Person33 person = new Person33(1, "Andy");
        person.dna();
        person.id();
        person.name();
        person.think();

        Animal00 animal = new Animal00("Alice");
        animal.name();

        Computer computer = new Computer(0b0001);
        computer.id();
        computer.think();

        ArrayList<AbstractPerson> al_abstractPerson = new ArrayList<>();
        ArrayList<Person33> al_person33 = new ArrayList<>();
        ArrayList<Identifable00> al_identifable = new ArrayList<>();
        ArrayList<Nameable00> al_nameable = new ArrayList<>();
        ArrayList<Thinkable00> al_thinkable = new ArrayList<>();
        ArrayList<Animal00> al_animal = new ArrayList<>();
        ArrayList<Computer> al_computer = new ArrayList<>();

        al_abstractPerson.add(person);
        al_person33.add(person);
        al_identifable.add(person);
        al_nameable.add(person);
        al_thinkable.add(person);
        //al_animal.add(person);
        //al_computer.add(person);

        //al_abstractPerson.add(animal);
        //al_person33.add(animal);
        //al_identifable.add(animal);
        al_nameable.add(animal);
        //al_thinkable.add(animal);
        al_animal.add(animal);
        //al_computer.add(animal);

        //al_abstractPerson.add(computer);
        //al_person33.add(computer);
        al_identifable.add(computer);
        //al_nameable.add(computer);
        al_thinkable.add(computer);
        //al_animal.add(computer);
        al_computer.add(computer);
    }
}
