package algorithm.greedy;

import java.util.Arrays;

public class _1_MarcCupWalk {
    long marcsCakewalk(int[] calorie) {
        Arrays.sort(calorie);
        long mileToWalk = 0;
        for (int i = 0; i < calorie.length; i++) {
            mileToWalk += findWalk(calorie[i], (calorie.length - i - 1));
        }
        return mileToWalk;
    }

    long findWalk(long calorie, long pos) {
        return ((long) Math.pow(2, pos)) * calorie;
    }
}
