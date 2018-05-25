package codegym.sort2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Data {
    public List<Employee> get() {
        //Scanner in = new Scanner(System.in);
        Scanner in = new Scanner("6\n"+
                "1000 Alex 2001 300 Masha 2006 250 Sasha 1012 400 Dima 2002 100 Sergey 2007 1500 Dima 2016");
        int N = in.nextInt();
        List<Employee> employees = new ArrayList<>(N);
        for (int i = 0; i < N; i+=2) {
            employees.add(new Employee(i, in.nextInt(), in.next(), in.nextInt()));
            employees.add(new Employee2(i+1, in.nextInt(), in.next(), in.nextInt()));
        }
        return employees;
    }
}
