package util;

import java.util.HashMap;
import java.util.Map;

public class FrequencyCount {
    public static Map<Integer, Integer> countFrequency(int[] input) {
        Map<Integer, Integer> frequencyByNumber = new HashMap<>();
        for (int val : input) {
            if (frequencyByNumber.containsKey(val))
                frequencyByNumber.put(val, frequencyByNumber.get(val) + 1);
            else
                frequencyByNumber.put(val, 1);
        }
        return frequencyByNumber;
    }

    public static Map<Character, Integer> countCharFrequency(String s) {
        Map<Character, Integer> charCount = new HashMap<>();
        for (char ch : s.toCharArray()) {
            if (charCount.containsKey(ch))
                charCount.put(ch, charCount.get(ch) + 1);
            else
                charCount.put(ch, 1);
        }
        return charCount;
    }
}
