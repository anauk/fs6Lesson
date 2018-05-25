package codegym.sort2;

public class Employee {
    int id;
    int salary;
    String name;
    int beginYear;

    public Employee(){

    }

    public Employee(int id, int salary, String name){
        this(id, salary, name, 0);
    }

    public Employee(int id, int salary, String name, int beginYear ){
        this.id = id;
        this.salary = salary;
        this.name = name;
        this.beginYear = beginYear;
    }

    public String fullName() {
        return id+" " + beginYear + " " + name + " "+salary;
    }
}