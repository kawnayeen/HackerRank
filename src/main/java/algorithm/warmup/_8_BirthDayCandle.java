package algorithm.warmup;

import util.FrequencyCount;

import java.util.HashMap;
import java.util.Map;

public class _8_BirthDayCandle {
    public int birthdayCakeCandles(int[] ar) {
        Map<Integer, Integer> sameHeightCandles = FrequencyCount.countFrequency(ar);
        int maxValue = Integer.MIN_VALUE;
        for (int value : ar) {
            if (value > maxValue)
                maxValue = value;
        }
        return sameHeightCandles.get(maxValue);
    }
}
