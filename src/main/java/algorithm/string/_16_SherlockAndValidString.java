package algorithm.string;

import java.util.*;
import java.util.stream.Collectors;

public class _16_SherlockAndValidString {
    private static final String YES = "YES";
    private static final String NO = "NO";

    String isValid(String s) {
        Map<Character, Integer> charFrequency = new HashMap<>();
        for (char ch : s.toCharArray()) {
            if (charFrequency.containsKey(ch)) {
                int presentCount = charFrequency.get(ch);
                presentCount++;
                charFrequency.put(ch, presentCount);
            } else {
                charFrequency.put(ch, 1);
            }
        }
        Set<Character> charSet = charFrequency.keySet();
        if (charSet.size() == 1)
            return YES;
        if (charSet.size() == s.length())
            return YES;
        HashMap<Integer, Integer> fMap = new HashMap<>();
        for (char ch : charSet) {
            int occurrence = charFrequency.get(ch);
            if (fMap.containsKey(occurrence)) {
                int count = fMap.get(occurrence);
                count++;
                fMap.put(occurrence, count);
            } else {
                fMap.put(occurrence, 1);
            }
        }

        Set<Integer> valSet = fMap.keySet();
        if (valSet.size() > 2)
            return NO;
        if (valSet.size() == 1)
            return YES;
        int firstVal = -1;
        int firstValCount = -1;
        int secondVal = -1;
        int secondValCount = -1;
        for (int val : valSet) {
            if (firstVal == -1) {
                firstVal = val;
                firstValCount = fMap.get(val);
            } else if (secondVal == -1) {
                secondVal = val;
                secondValCount = fMap.get(val);
            }
        }
        if (firstVal == 1 && firstValCount == 1)
            return YES;
        if (secondVal == 1 && secondValCount == 1)
            return YES;
        if (firstValCount == 1 && firstVal - secondVal == 1)
            return YES;
        if (secondValCount == 1 && secondVal - firstVal == 1)
            return YES;
        return NO;
    }
}
