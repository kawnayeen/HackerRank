package algorithm.implementation;

import java.util.List;

/**
 * kawnayeen
 * 5/9/18
 */
public class _5_BirthdayChocolate {
    int birthday(List<Integer> s, int d, int m) {
        int totalCombination = 0;
        for (int i = 0; i <= (s.size() - m); i++) {
            int sum = 0;
            for (int j = 0; j < m; j++) {
                sum += s.get(i + j);
            }
            if(sum==d)
                totalCombination++;
        }
        return totalCombination;
    }
}
