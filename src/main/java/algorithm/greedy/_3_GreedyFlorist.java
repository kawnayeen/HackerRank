package algorithm.greedy;

import java.util.Arrays;

public class _3_GreedyFlorist {
    int getMinimumCost(int k, int[] c) {
        if (k >= c.length)
            return Arrays.stream(c).sum();
        int sum = 0;
        c = Arrays.stream(c).sorted().toArray();
        int totalFlour = c.length;
        for (int i = 0; i < totalFlour; i++) {
            int multiplier = (int) Math.ceil((i + 1) * 1.0 / k);
            sum += (c[totalFlour - i - 1] * multiplier);
        }
        return sum;
    }
}
