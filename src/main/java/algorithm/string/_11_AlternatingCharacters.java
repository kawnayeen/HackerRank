package algorithm.string;

import java.util.ArrayList;
import java.util.List;

public class _11_AlternatingCharacters {
    int alternatingCharacters(String s) {
        List<Integer> sameChar = new ArrayList<>();
        char startingChar = s.charAt(0);
        int count = 0;
        for (char ch : s.toCharArray()) {
            if (ch == startingChar)
                count++;
            else {
                sameChar.add(count);
                count = 1;
                startingChar = ch;
            }
        }
        sameChar.add(count);
        System.err.println(sameChar);
        int deletion = 0;
        for (int val : sameChar)
            deletion += (val - 1);
        return deletion;
    }
}
