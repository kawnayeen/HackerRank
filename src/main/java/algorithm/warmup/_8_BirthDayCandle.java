package algorithm.warmup;

import java.util.HashMap;
import java.util.Map;

public class _8_BirthDayCandle {
    public int birthdayCakeCandles(int[] ar) {
        Map<Integer, Integer> sameHeightCandles = new HashMap<>();
        int maxValue = Integer.MIN_VALUE;
        for (int value : ar) {
            if (sameHeightCandles.containsKey(value)) {
                int count = sameHeightCandles.get(value);
                count++;
                sameHeightCandles.put(value, count);
            } else {
                sameHeightCandles.put(value, 1);
            }
            if (value > maxValue)
                maxValue = value;
        }
        return sameHeightCandles.get(maxValue);
    }
}
