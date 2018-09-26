package datastructure.stack;

import java.util.*;

public class _3_BalanceBrackets {
    String isBalanced(String s) {
        if (s.length() % 2 == 1)
            return "NO";
        Stack<Character> charStack = new Stack<>();
        Map<Character, Character> charMap = new HashMap<>();
        charMap.put('(', ')');
        charMap.put('{', '}');
        charMap.put('[', ']');
        Set<Character> startingSet = charMap.keySet();
        boolean maintained = true;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (startingSet.contains(ch))
                charStack.push(ch);
            else {
                if (charStack.size() == 0 || ch != charMap.get(charStack.pop())) {
                    maintained = false;
                    break;
                }
            }
        }
        if (maintained && charStack.size() == 0)
            return "YES";
        return "NO";
    }
}
