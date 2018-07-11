package cw180706;

public class Problem5 {
    public static void main(String[] args) {
        //String origin = "Hello World!";
        String origin = "привет";
        System.out.println(origin);
        //byte[] bytes = origin.getBytes();
        char[] bytes = origin.toCharArray();

        for (int i = 0; i < bytes.length/2; i++) {
            char tmp = bytes[i];
            bytes[i] = bytes[bytes.length-i-1];
            bytes[bytes.length-i-1] = tmp;
        }

        String reverted = new String(bytes);
        System.out.println(reverted);
    }
}
