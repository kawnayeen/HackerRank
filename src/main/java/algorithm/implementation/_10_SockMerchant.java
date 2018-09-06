package algorithm.implementation;

import java.util.HashMap;
import java.util.Map;

/**
 * kawnayeen
 * 6/9/18
 */
public class _10_SockMerchant {
    int sockMerchant(int n, int[] ar) {
        Map<Integer, Integer> frequencyCount = new HashMap<>();
        for (int val : ar) {
            if (frequencyCount.containsKey(val)) {
                int presentCount = frequencyCount.get(val);
                presentCount++;
                frequencyCount.put(val, presentCount);
            } else {
                frequencyCount.put(val, 1);
            }
        }
        int numberOfPair = 0;
        for (int key : frequencyCount.keySet()) {
            numberOfPair += frequencyCount.get(key) / 2;
        }
        return numberOfPair;
    }
}
