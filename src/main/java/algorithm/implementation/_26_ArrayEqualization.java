package algorithm.implementation;

import util.FrequencyCount;

import java.util.Map;

public class _26_ArrayEqualization {
    int equalizeArray(int[] arr) {
        Map<Integer, Integer> frequency = FrequencyCount.countFrequency(arr);
        int maxFrequency = 0;
        for (int val : frequency.keySet()) {
            if (frequency.get(val) > maxFrequency) {
                maxFrequency = frequency.get(val);
            }
        }
        return arr.length - maxFrequency;
    }
}
