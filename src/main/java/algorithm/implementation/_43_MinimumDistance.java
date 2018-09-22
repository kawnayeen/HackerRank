package algorithm.implementation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class _43_MinimumDistance {
    private static final int MAX_INDEX = 1001;

    int minimumDistances(int[] a) {
        Map<Integer, List<Integer>> indices = new HashMap<>();
        for (int i = 0; i < a.length; i++) {
            if (indices.containsKey(a[i])) {
                indices.get(a[i]).add(i);
            } else {
                List<Integer> indexList = new ArrayList<>();
                indexList.add(i);
                indices.put(a[i], indexList);
            }
        }
        int minimumDistance = MAX_INDEX;
        for (int key : indices.keySet()) {
            if (indices.get(key).size() > 1) {
                List<Integer> indexes = indices.get(key);
                int distance = indexes.get(1) - indexes.get(0);
                if (distance < minimumDistance)
                    minimumDistance = distance;
            }
        }
        return minimumDistance == MAX_INDEX ? -1 : minimumDistance;
    }
}
