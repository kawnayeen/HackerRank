package algorithm.implementation;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class _40_BiggerIsGreater {
    private static final String NO_ANSWER = "no answer";

    String biggerIsGreater(String w) {
        char[] chars = w.toCharArray();
        int brokenIndex = -1;
        for (int i = chars.length - 2; i >= 0; i--) {
            if (chars[i] < chars[i + 1]) {
                brokenIndex = i;
                break;
            }
        }
        if (brokenIndex == -1)
            return NO_ANSWER;
        List<Character> charUnderScrutiny = new ArrayList<>();
        for (int i = brokenIndex; i < chars.length; i++)
            charUnderScrutiny.add(chars[i]);
        charUnderScrutiny = charUnderScrutiny.stream().sorted().collect(Collectors.toList());
        int magicIndex = 0;
        for (int i = 0; i < charUnderScrutiny.size(); i++) {
            if (charUnderScrutiny.get(i) > chars[brokenIndex]) {
                magicIndex = i;
                break;
            }
        }
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < brokenIndex; i++)
            builder.append(chars[i]);
        builder.append(charUnderScrutiny.get(magicIndex));
        charUnderScrutiny.remove(magicIndex);
        for (Character c : charUnderScrutiny)
            builder.append(c);
        return builder.toString().trim();
    }
}
