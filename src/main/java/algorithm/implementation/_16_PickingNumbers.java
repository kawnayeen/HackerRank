package algorithm.implementation;

import util.FrequencyCount;

import java.util.Map;

public class _16_PickingNumbers {
    int pickingNumbers(int[] a) {
        Map<Integer, Integer> frequency = FrequencyCount.countFrequency(a);
        int maxOccurrence = 0;
        int[] uniqueValues = frequency.keySet().stream().mapToInt(Integer::intValue).sorted().toArray();
        for (int i = 0; i < uniqueValues.length - 1; i++) {
            if (uniqueValues[i + 1] - uniqueValues[i] == 1) {
                int combinedOccurrence = frequency.get(uniqueValues[i]) + frequency.get(uniqueValues[i + 1]);
                if (combinedOccurrence > maxOccurrence)
                    maxOccurrence = combinedOccurrence;
            }
        }

        for (int key : uniqueValues) {
            if (frequency.get(key) > maxOccurrence)
                maxOccurrence = frequency.get(key);
        }

        return maxOccurrence;
    }
}
