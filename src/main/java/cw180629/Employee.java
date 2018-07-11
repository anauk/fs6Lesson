package cw180629;

public class Employee {
    private final String s;

    public Employee(String s) {
        this.s = s;
    }

    public String position() {
        return s.substring(0,s.indexOf(":"));
    }

    public String name() {
        return s.substring(s.indexOf(":")+1, s.length());
    }

    public static void main(String[] args) {
        Employee e = new Employee("Manager:Alex");
        System.out.println(e.position());
        System.out.println(e.name());
    }
}
