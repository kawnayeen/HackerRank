package algorithm.warmup;

import java.util.Arrays;
import java.util.List;

/**
 * kawnayeen
 * 4/9/18
 */
public class _2_CompareTriplets {
    public List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        int aliceScore = 0;
        int bobScore = 0;
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i) > b.get(i)) {
                aliceScore++;
            } else if (a.get(i) < b.get(i)) {
                bobScore++;
            }
        }
        return Arrays.asList(aliceScore, bobScore);
    }
}
