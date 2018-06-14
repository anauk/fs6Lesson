package oop.patterns.dao;

import oop.patterns.dao.entities.Customer;

public class CustomerTest {
    public static void case1() {
        Customer cust = new Customer();
        cust.setId(100);
        cust.setName("Alex");
        System.out.println(cust.toString());
    }

    public static void case2() {
        Customer cust = new Customer(5, "Masha");
        System.out.println(cust.toString());
    }

    public static void case3() {
        Customer cust = new Customer(33, "Victor");
        int id=cust.getId();
        String name=cust.getName();
        System.out.println(id + " " + name);
    }

    public static void main(String[] args) {
        case1();
        case2();
        case3();
    }
}