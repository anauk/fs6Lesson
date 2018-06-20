package io;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Example2 {
    static Logger log = LoggerFactory.getLogger(Example2.class);

    public static String extractName(String s){
        return s.substring(6, s.length());
    }

    public static int extractSalary(String s){
        return Integer.parseInt(s.substring(8, s.length()));
    }

    public static void main1(String[] args) throws FileNotFoundException {

        File employeesData = new File("./src/main/java/io", "data.txt");
        log.info("File: "+employeesData.toString()+" found "+employeesData.exists());

        BufferedReader bf = new BufferedReader(new FileReader(employeesData));
        ArrayList<String> emp = new ArrayList<>();
        ArrayList<Employee> outcome = new ArrayList<>();
        bf.lines()
                .filter(s -> s.contains("Name:") || s.contains("Salary:"))
                .forEachOrdered(new Consumer<String>() {
                    @Override
                    public void accept(String s) {
                        log.info(s);
                        emp.add(s);
                    }
                });

        emp.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });

        for (int i = 0; i < emp.size(); i+=2) {
            String tempName ="";
            int tempSalary =0;
            if (emp.get(i).startsWith("Name")){
                tempName = extractName(emp.get(i));
            }

            if (emp.get(i+1).startsWith("Salary")){
                tempSalary = extractSalary(emp.get(i + 1));
            }
            outcome.add(new Employee(tempName, tempSalary));
        }

        Employee e = new Employee("Sergey", 70);
        outcome.add(e);
        outcome.forEach(System.out::println);
        HashSet<Employee> employeeHashSet = new HashSet<>();
        outcome.forEach(e1 -> employeeHashSet.add(e1));
        System.out.println("");
        employeeHashSet.forEach(new Consumer<Employee>() {
            @Override
            public void accept(Employee employee) {
                System.out.println(employee);
            }
        });
    }

    public static void main(String[] args) {
        Set<Employee> hs = new HashSet<>();
        Employee e1 = new Employee("Sergey", 1000);
        Employee e2 = new Employee("Sergey", 1000);
        hs.add(e1);
        hs.add(e2);
        System.out.println(e1.equals(e2));
        hs.forEach(System.out::println);
    }

    public static void main3(String[] args) {
        HashSet<String> hs = new HashSet<>();
        String e1 = new String("Sergey");
        String e2 = new String("Sergey");
        hs.add(e1);
        hs.add(e2);
        System.out.println(e1.equals(e2));
        hs.forEach(System.out::println);
    }

    public static void main4(String[] args) {
        HashSet<String> hs = new HashSet<>();
        hs.add("Sergey1");
        hs.add("Sergey"+"1");
        hs.forEach(System.out::println);
    }
}
