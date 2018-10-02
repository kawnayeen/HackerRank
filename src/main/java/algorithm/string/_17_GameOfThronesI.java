package algorithm.string;

import util.FrequencyCount;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class _17_GameOfThronesI {
    private static final String YES = "YES";
    private static final String NO = "NO";

    String gameOfThrones(String s) {
        Map<Character, Integer> charCount = FrequencyCount.countCharFrequency(s);
        List<Integer> oddValues = charCount.values().stream()
                .filter(val -> val % 2 == 1)
                .collect(Collectors.toList());
        if (oddValues.size() > 1)
            return NO;
        if (oddValues.size() == 0)
            return YES;
        if (s.length() % 2 == 1)
            return YES;
        return NO;
    }
}
