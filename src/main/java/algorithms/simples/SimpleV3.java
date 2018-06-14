package algorithms.simples;

import java.util.Arrays;

public class SimpleV3 {
    private final int max;
    private final int min;
    private int sim[];
    private int sim_idx=0;

    SimpleV3(int mn, int mx) {
        max = mx;
        min = mn;
        sim = new int[this.max/10];
    }

    int[] array() {
        for (int idx=1;idx<=max;idx++) {
            if (new SimpleDynamic(idx, sim, sim_idx).is()) {
                sim[sim_idx++] = idx;
            }
        }
        int min_index=0;
        if (min>1) {
            for (int i=0;i<sim_idx; i++) {
                if (sim[i]>=min) {
                    min_index=i;
                    break;
                }
            }
        }
        return Arrays.copyOfRange(sim,min_index,sim_idx);
    }

}