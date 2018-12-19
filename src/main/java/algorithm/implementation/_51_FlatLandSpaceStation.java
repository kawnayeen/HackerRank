package algorithm.implementation;

import java.util.Arrays;

public class _51_FlatLandSpaceStation {
    int flatlandSpaceStations(int n, int[] c) {
        if (n == c.length)
            return 0;
        int minimumValue = 0;
        int maximumValue = n - 1;
        int maxDistance = -1;
        if (c.length == 1) {
            maxDistance = Math.max(Math.abs(c[0] - minimumValue), Math.abs(maximumValue - c[0]));
        } else {
            c = Arrays.stream(c).sorted().toArray();
            int totalSpaceStation = c.length;
            maxDistance = Math.max(
                    Math.abs(c[0] - minimumValue),
                    Math.abs(maximumValue - c[totalSpaceStation - 1])
            );
            for (int i = 0; i < totalSpaceStation - 1; i++) {
                int maxInterStationDistance = (c[i + 1] - c[i]) / 2;
                if (maxInterStationDistance > maxDistance)
                    maxDistance = maxInterStationDistance;
            }
        }
        return maxDistance;
    }
}
