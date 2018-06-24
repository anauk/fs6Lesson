package io;

public class Employee implements Comparable<Employee>{
    private String name;
    private int salary;

    @Override
    public int hashCode() {
        return salary+name.hashCode()*31;
    }

    public Employee(String name, int salary){
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return this.name;
    }

    public int getSalary() {
        return this.salary;
    }

    @Override
    public String toString() {
        return String.format("Employee: [name: %s, salary: %d]", this.name, this.salary);
    }


    @Override
    public int compareTo(Employee o) {
        return this.salary - o.salary;
    }
    public boolean equals1(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Employee)) return false;
        return this.salary == ((Employee)obj).salary
                && this.name.equals(((Employee)obj).name);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Employee)) return false;
        Employee e = (Employee) obj;
        return this.salary == e.salary
                && this.name.equals(e.name);
    }
}
