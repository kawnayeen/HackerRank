package algorithm.implementation;

import java.util.stream.IntStream;

public class _48_ServiceLane {
    int[] serviceLane(int[] width, int[][] cases) {
        int[] output = new int[cases.length];
        for (int i = 0; i < cases.length; i++) {
            int start = cases[i][0];
            int end = cases[i][1];
            int maxWidth = IntStream.rangeClosed(start, end).map(val -> width[val]).min().orElse(-1);
            output[i] = maxWidth;
        }
        return output;
    }
}
