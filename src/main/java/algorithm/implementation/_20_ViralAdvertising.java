package algorithm.implementation;

import java.util.Arrays;

public class _20_ViralAdvertising {
    int viralAdvertising(int n) {
        int[] viewerByDay = new int[n];
        int[] likeByDay = new int[n];
        for (int i = 0; i < n; i++) {
            if (i == 0) {
                viewerByDay[i] = 5;
                likeByDay[i] = 2;
            } else {
                viewerByDay[i] = likeByDay[i - 1] * 3;
                likeByDay[i] = viewerByDay[i] / 2;
            }
        }
        return Arrays.stream(likeByDay).sum();
    }
}
