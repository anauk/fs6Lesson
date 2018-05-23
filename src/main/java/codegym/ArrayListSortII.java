package codegym;

import java.util.*;

public class ArrayListSortII {

    static class Employee {
        int id;
        int salary;
        String name;
    }

    public static void main(String[] args) {
        //Scanner in = new Scanner(System.in);
        Scanner in = new Scanner("5 1000 Alex 300 Masha 250 Sasha 400 Dima 100 Sergey");
        int N = in.nextInt();
        ArrayList<Employee> employees = new ArrayList<>(N);
        for (int i = 0; i < N; i++) {
            int salary = in.nextInt();
            Employee e = new Employee();
            e.id = i;
            e.salary = salary;
            e.name = in.next();
            employees.add(e);
        }

        employees.sort(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.salary - o2.salary;
            }
        });

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <  employees.size(); i++){
            sb.append(employees.get(i).id+" ");
        }
        System.out.println(sb.toString().trim());
    }
}