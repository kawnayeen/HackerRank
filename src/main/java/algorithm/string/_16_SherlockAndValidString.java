package algorithm.string;

import java.util.*;

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

        List<Integer> frequencyList = new ArrayList<>(charFrequency.values());
        Collections.sort(frequencyList);
        int startIndex = 0;
        int delCount = 0;
        String isValid = YES;
        if (frequencyList.get(0) == 1 && frequencyList.get(1) > 1) {
            startIndex = 1;
            delCount = 1;
        }
        for (int i = startIndex; i < frequencyList.size() - 1; i++) {
            delCount += frequencyList.get(i + 1) - frequencyList.get(startIndex);
            if (delCount > 1) {
                isValid = NO;
                break;
            }
        }
        return isValid;
    }
}
