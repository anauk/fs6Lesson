package generics;

import steak.Steak;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class GenTest {
    public static int get(int val) {

        return 1;
    }

    public static int get(String val) {

        return 1;
    }

    public static int get(Character val) {

        return 1;
    }

    public static int get(Value val) {

        return 1;
    }

    public static int get(Object val) {
        if (val instanceof Integer) {
            //(Integer)val
        }
        if (val instanceof String) {
            //(String)val.
        }

        return 1;
    }



    public static void main(String[] args) {
        get(1);
        get("ABC");
        get(new Character('J'));


        Value v0 = new Value<Integer>(77);
        Object val0 = v0.getVal();
        Integer val01 = ((Value<Integer>) val0).getVal();


        Value<Integer> v1 = new Value<Integer>(77);
        Integer val1 = v1.getVal();

        Value<String> v2 = new Value<String>("ABC");
        String val2 = v2.getVal();

        Value<Character> v3 = new Value<Character>('J');
        Character val = v3.getVal();

        get(v1);
        get(v2);
        get(v3);

        Value<Steak> v4 = new Value<>(new Steak("Rare"));
        Steak val3 = v4.getVal();



        ArrayList<Steak> al = new ArrayList<>();
/*
        al.add(0);
        Integer intv = al.get(0);
        Collectors
*/

    }


}
