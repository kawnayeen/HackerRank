package algorithm.string;

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
}

public class _10_SherlockAndAnagram {
    int sherlockAndAnagrams(String s) {
        HashSet<Character> charSet = new HashSet<>();
        for (char ch : s.toCharArray())
            charSet.add(ch);
        if (charSet.size() == s.length())
            return 0;

        Map<Integer, List<String>> subStringByLength = new HashMap<>();
        for (int i = 1; i < s.length(); i++) {
            List<String> currList = new ArrayList<>();
            for (int j = 0; j <= s.length() - i; j++) {
                currList.add(s.substring(j, j + i));
            }
            subStringByLength.put(i, currList);
        }

        int count = 0;
        for (int key : subStringByLength.keySet()) {
            List<String> stringList = subStringByLength.get(key);
            for (int i = 0; i < stringList.size() - 1; i++) {
                for (int j = i + 1; j < stringList.size(); j++) {
                    if (stringList.get(i).equals(stringList.get(j))){
                        count++;
                    }
                    else {
                        CharCounts iCharCount = new CharCounts(charSet, stringList.get(i));
                        CharCounts jCharCount = new CharCounts(charSet, stringList.get(j));
                        if (iCharCount.isSame(jCharCount)) {
                            count++;
                        }
                    }
                }
            }
        }
        return count;
    }
}
