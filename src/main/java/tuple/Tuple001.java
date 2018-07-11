package tuple;

import org.javatuples.Pair;
import org.javatuples.Quartet;
import org.javatuples.Triplet;
import org.javatuples.Tuple;

import java.util.ArrayList;

public class Tuple001 {
    public static void main(String[] args) {
        Pair<Integer, Integer> p = new Pair<>(1, 2);
        p.getValue0();
        p.getValue1();

        Triplet<Integer, Integer, String> t1 = new Triplet<>(1, 2, "Hello");
        Triplet<Integer, String, String> t2 = new Triplet<>(1, "World", "Hello");
        Quartet<Integer, String, Integer, Integer> alex = new Quartet<>(1, "Alex", 43, 10000);
        ArrayList<Quartet<Integer, String, Integer, Integer>> people = new ArrayList<>();
        people.add(new Quartet<>(1,"1",1,1));
        people.add(alex);

        Triplet<Integer, Integer, String> house = p.add("House");
        Triplet<String, Integer, String> smart = house.setAt0("Smart");
        Pair<Double, String> objects = smart.removeFrom0().setAt0(1.1D);
        System.out.println(t1);
        //kjbnkjbkjb.
    }
}
