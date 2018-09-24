package algorithm.string;

import java.util.HashSet;

public class _15_Gemstones {
    int gemstones(String[] arr) {
        HashSet<Character> charSet = new HashSet<>();
        for (String str : arr)
            for (char ch : str.toCharArray())
                charSet.add(ch);
        int gemCount = 0;
        for (Character ch : charSet) {
            int presenceCount = 0;
            String charSequence = String.valueOf(ch);
            for (String str : arr) {
                if (str.contains(charSequence)) {
                    presenceCount++;
                }
            }
            if (presenceCount == arr.length)
                gemCount++;
        }
        return gemCount;
    }
}
