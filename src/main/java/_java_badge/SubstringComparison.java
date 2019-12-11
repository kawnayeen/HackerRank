package _java_badge;

import java.util.ArrayList;
import java.util.List;

public class SubstringComparison {
    public List<String> getSmallestSubstrings(String s, int k) {
        List<String> substrings = new ArrayList<>();
        for (int i = 0; (i + k) <= s.length(); i++) {
            substrings.add(s.substring(i, i + k));
        }
        return substrings;
    }
}
