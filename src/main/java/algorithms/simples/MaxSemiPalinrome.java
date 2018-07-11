package algorithms.simples;

public class MaxSemiPalinrome {
    final int MIN=0;
    final int MAX=9999;

    public long doFind() {
        int[] simples = new SimpleV4(MIN, MAX).array();
        long max=0;
        PalindromeSemiWoString p = new PalindromeSemiWoString();
        for (int i = 0; i < simples.length; i++) {
            for (int j = simples.length-1; j > i ; j--) {
                long mult = (long) simples[i] * simples[j];
                if ((mult > max) && p.is(mult)) {
                    max = mult;
                    break;
                }
            }
        }
        return max;
    }

    public static void main(String[] args) {
        final int ITER_COUNT=100;
        MaxSemiPalinrome p = new MaxSemiPalinrome();
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
