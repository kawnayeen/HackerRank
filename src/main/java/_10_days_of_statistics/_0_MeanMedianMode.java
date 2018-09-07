package _10_days_of_statistics;

import util.DoubleUtil;
import util.FrequencyCount;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class _0_MeanMedianMode {
    double findMean(int[] arr) {
        long sum = Arrays.stream(arr).sum();
        return DoubleUtil.round((sum * 1f) / arr.length, 1);
    }

    double findMedian(int[] arr) {
        int[] sorted = Arrays.stream(arr).sorted().toArray();
        if (arr.length % 2 == 1)
            return sorted[arr.length / 2];
        int firstMedianIndex = arr.length / 2;
        int secondMedianIndex = firstMedianIndex - 1;
        long medianValue = sorted[firstMedianIndex] + sorted[secondMedianIndex];
        return DoubleUtil.round(medianValue / 2.0, 1);
    }

    int findMode(int[] arr) {
        Map<Integer, Integer> frequencyCount = FrequencyCount.countFrequency(arr);
        List<Integer> keySet = frequencyCount.keySet().stream().map(val -> (int) val).sorted().collect(Collectors.toList());
        int maxOccurrence = -1;
        int currentMedian = 0;
        for (int val : keySet) {
            if (frequencyCount.get(val) > maxOccurrence) {
                maxOccurrence = frequencyCount.get(val);
                currentMedian = val;
            }
        }
        return currentMedian;
    }
}
