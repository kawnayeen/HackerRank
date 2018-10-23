package algorithm.greedy;

import java.util.Arrays;

/**
 * kawnayeen
 * 23/10/18
 */
public class _6_MarkAndToys {
    int maximumToys(int[] prices, int k) {
        prices = Arrays.stream(prices).sorted().toArray();
        int toyCount = 0;
        int toyCost = 0;
        for (int cost : prices) {
            if ((toyCost + cost) <= k) {
                toyCost += cost;
                toyCount++;
            }
        }
        return toyCount;
    }
}
