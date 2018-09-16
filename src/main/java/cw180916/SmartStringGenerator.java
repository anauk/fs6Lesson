package cw180916;

import java.util.ArrayList;
import java.util.List;

public class SmartStringGenerator {
    List<String> get(int quantity, int minLength, int maxLength) {
        ArrayList<String> strings = new ArrayList<>();
        for (int i = 0; i < quantity; i++) {
            String value = generateString(minLength, maxLength);
            strings.add(value);
        }
        return strings;
    }

    private String generateString(int minLength, int maxLength) {
        StringBuilder sb = new StringBuilder();
        int len = new SmartIntegerGenerator().getOne(minLength,maxLength);
        for (int i = 0; i < len; i++) {
            char one = (char) new SmartIntegerGenerator().getOne('a', 'z');
            sb.append(one);
        }
        return sb.toString();
    }

}
