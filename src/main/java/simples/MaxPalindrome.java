package simples;

public class MaxPalindrome {
    final static int MIN=10000;
    final static int MAX=99999;

    public static void mainToLong(String[] args) {
        long max=0;
        for (long i = MIN; i <= MAX; i++) {
            for (long j = i; j <= MAX; j++) {
                if (SimpleV2.isSimple(i) && SimpleV2.isSimple(j)) {
                    long mult=(long)i*j;
                    if (Palindrome.isPalindrome(mult)) {
                        if (mult > max) {
                            max = mult;
                            System.out.println(max);
                        }
                    }
                }
            }
        }
        System.out.println(max);
    }

    public static void mainGood(String[] args) {
        long l=System.currentTimeMillis();
        int[] simples = SimpleV2.getSimples(MIN, MAX);
        long max=0;
        for (int i = 0; i < simples.length; i++) {
            for (int j = i; j < simples.length; j++) {
                long mult=(long)simples[i]*simples[j];
                if (Palindrome.isPalindrome(mult) && (mult > max)) {
                    max = mult;
                }
            }
        }
        l=System.currentTimeMillis()-l;
        System.out.printf("Maximum:%d\n",max);
        System.out.printf("time:%dms\n",l);
    }

    public static void mainBest(String[] args) {
        long l=System.currentTimeMillis();
        int[] simples = new SimpleV3(MIN, MAX).array();
        long max=0;
        for (int i = 0; i < simples.length; i++) {
            for (int j = i; j < simples.length; j++) {
                long mult=(long)simples[i]*simples[j];
                if (Palindrome.isPalindrome(mult) && (mult > max)) {
                    max = mult;
                }
            }
        }
        l=System.currentTimeMillis()-l;
        System.out.printf("Maximum:%d\n",max);
        System.out.printf("time:%dms\n",l);
    }

    public static void mainTheBest() {
        int[] simples = new SimpleV3(MIN, MAX).array();
        long max=0;
        for (int i = 0; i < simples.length; i++) {
            for (int j = simples.length-1; j > i ; j--) {
                long mult=(long)simples[i]*simples[j];
                if ((mult > max) && Palindrome.isPalindrome(mult)) {
                    max = mult;
                    break;
                }
            }
        }
        System.out.printf("Maximum:%d\n",max);
    }

    public static void main(String[] args) {
        long l=System.currentTimeMillis();
        final int ITER=10;
        for (int i = 0; i < ITER; i++) {
            mainTheBest();
        }
        l=System.currentTimeMillis()-l;
        System.out.println(l/ITER);
    }
}
