package algorithm.implementation;

import java.util.HashMap;
import java.util.Map;

/**
 * kawnayeen
 * 13/9/18
 */
public class _37_BeautifulTriplet {
    int beautifulTriplets(int d, int[] arr) {
        int count = 0;
        int arraySize = arr.length;
        Map<Integer, Integer> jMap = new HashMap<>();
        for (int i = 0; i < arraySize - 1; i++) {
            for (int j = i + 1; j < arraySize; j++) {
                if (arr[j] - arr[i] == d) {
                    if (jMap.containsKey(j)) {
                        int jCount = jMap.get(j);
                        jCount++;
                        jMap.put(j, jCount);
                    } else
                        jMap.put(j, 1);
                    if (jMap.containsKey(i))
                        count += jMap.get(i);
                }
            }
        }
        return count;
    }
}
