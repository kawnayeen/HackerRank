package algorithm.string;

import java.util.HashSet;
import java.util.Set;

public class _19_StringConstruction {
    int stringConstruction(String s) {
        Set<Character> charSet = new HashSet<>();
        for (char ch : s.toCharArray())
            charSet.add(ch);
        return charSet.size();
    }
}
