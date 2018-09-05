package algorithm.implementation;

/**
 * kawnayeen
 * 5/9/18
 */
public class _4_BreakingRecord {
    int[] breakingRecords(int[] scores) {
        int maxScore = scores[0];
        int minScore = scores[0];
        int maxBrokenCount = 0;
        int minBrokenCount = 0;
        for (int i = 1; i < scores.length; i++) {
            if (scores[i] > maxScore) {
                maxScore = scores[i];
                maxBrokenCount++;
            }
            if (scores[i] < minScore) {
                minScore = scores[i];
                minBrokenCount++;
            }
        }
        return new int[]{maxBrokenCount, minBrokenCount};
    }
}
