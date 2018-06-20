package io;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Example2 {
    static Logger log = LoggerFactory.getLogger(Example2.class);

    public static String extractName(String s){
        return s.substring(6, s.length());
    }

    public static int extractSalary(String s){
        return Integer.parseInt(s.substring(8, s.length()));
    }

    public static void main(String[] args) throws FileNotFoundException {

        File employeesData = new File("./src/main/java/io", "data.txt");
        log.info("File: "+employeesData.toString()+" found "+employeesData.exists());

        BufferedReader bf = new BufferedReader(new FileReader(employeesData));
        ArrayList<String> emp = new ArrayList<>();
        bf.lines()
                .filter(s -> s.contains("Name:") || s.contains("Salary:"))
                .forEachOrdered(new Consumer<String>() {
            @Override
            public void accept(String s) {
                log.info(s);
                emp.add(s);
            }
        });




    }

}
