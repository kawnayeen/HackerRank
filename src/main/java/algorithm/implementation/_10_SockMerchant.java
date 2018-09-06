package algorithm.implementation;

import util.FrequencyCount;

import java.util.HashMap;
import java.util.Map;

/**
 * kawnayeen
 * 6/9/18
 */
public class _10_SockMerchant {
    int sockMerchant(int n, int[] ar) {
        Map<Integer, Integer> frequencyCount = FrequencyCount.countFrequency(ar);
        int numberOfPair = 0;
        for (int key : frequencyCount.keySet()) {
            numberOfPair += frequencyCount.get(key) / 2;
        }
        return numberOfPair;
    }
}
