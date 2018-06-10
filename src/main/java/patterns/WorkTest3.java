package patterns;

import java.util.Scanner;

public class WorkTest3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i = in.nextInt();

        Workable built = WorkBuilder.build(i);

        built.work();
    }
}
