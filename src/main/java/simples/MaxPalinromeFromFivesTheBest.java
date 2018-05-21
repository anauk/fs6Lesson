package simples;

public class MaxPalinromeFromFivesTheBest {
    final int MIN=10000;
    final int MAX=99999;

    boolean findValue(int[]a, int v) {
        for (int i = 0; i < a.length; i++) {
            if (a[i]==v) return true;
        }
        return false;
    }

    public long doFind() {
        int[] simples = new SimpleV4(MIN, MAX).array();
        long max=0;
        PalindromeWoString p = new PalindromeWoString();
        for (int i = 0; i < simples.length; i++) {
            for (int j = simples.length-1; j > i ; j--) {
                long mult=(long)simples[i]*simples[j];
                if ((mult > max) && p.is(mult)) {
                    max = mult;
                    break;
                }
            }
        }
        return max;
    }

    public static void main(String[] args) {
        final int ITER_COUNT=10;
        MaxPalinromeFromFivesTheBest p = new MaxPalinromeFromFivesTheBest();
        long l=System.currentTimeMillis();
        long max=0;
        for (int i = 0; i < ITER_COUNT; i++) {
            max=p.doFind();
        }
        l=System.currentTimeMillis()-l;
        System.out.printf("Maximum:%d\n",max);
        System.out.printf("Time spent:%d\n", l/ITER_COUNT);
    }
}
