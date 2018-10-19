package algorithm.greedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _5_PriyankaToys {
    int toys(int[] w) {
        w = Arrays.stream(w).sorted().toArray();
        List<Integer> containers = new ArrayList<>();
        containers.add(0, w[0]);
        for (int i = 0; i < w.length; i++) {
            if (w[i] - containers.get(0) > 4) {
                containers.add(0, w[i]);
            }
        }
        return containers.size();
    }
}
