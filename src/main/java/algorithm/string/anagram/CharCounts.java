package algorithm.string.anagram;

import java.util.*;

class CharCounts {
    Map<Character, Integer> counts;

    public CharCounts(HashSet<Character> charSet, String str) {
        counts = new HashMap<>();
        for (Character ch : charSet)
            counts.put(ch, 0);
        for (Character ch : str.toCharArray()) {
            int presentCount = counts.get(ch);
            presentCount++;
            counts.put(ch, presentCount);
        }
    }

    public boolean isSame(CharCounts charCounts) {
        boolean same = true;
        for (Character ch : counts.keySet()) {
            if (counts.get(ch) != charCounts.counts.get(ch)) {
                same = false;
                break;
            }
        }
        return same;
    }

    public int getDifference(CharCounts charCounts) {
        int difference = 0;
        for (Character ch : counts.keySet()) {
            difference += Math.abs(counts.get(ch) - charCounts.counts.get(ch));
        }
        return difference;
    }
}
