package algorithms.simples;

public class SimpleDynamic {
    private final int origin;
    private final int[] simples;
    private final int length;

    SimpleDynamic(int num, int[] simp, int len) {
        origin = num;
        simples = simp;
        length =len;
    }

    private boolean restIsZero(int idx) {
        return (origin % simples[idx]) == 0;
    }

    private boolean toBeAnalyzed(int idx, int max) {
        return simples[idx]<=max;
    }

    boolean is() {
        if (origin==1) return false;
        if (origin==2) return true;
        int maxToAnalyze = (int) Math.sqrt(origin);
        for (int idx=0; idx<length; idx++) {
            if (toBeAnalyzed(idx, maxToAnalyze) && restIsZero(idx)) {
                return false;
            }
        }
        return true;
    }
}