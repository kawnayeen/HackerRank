package algorithm.string.anagram;

import java.util.*;

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
