package algorithm.string;

import java.util.HashMap;
import java.util.Map;

public class _8_SeparateTheNumbers {
    private static final String INVALID_PREFIX = "0";
    private static final String NO = "NO";
    private static final String YES = "YES";

    void separateNumbers(String s) {
        if (s.startsWith(INVALID_PREFIX) || isSameChar(s)) {
            System.out.println(NO);
            return;
        }
        String backup = new String(s);
        int maxLength = s.length() / 2;
        boolean maintained = false;
        long startingValue = -1;
        for (int i = 1; i <= maxLength; i++) {
            s = backup;
            maintained = true;
            int startSplit = 0;
            int length = i;
            long previousNumber = Long.parseLong(s.substring(startSplit, length));
            s = s.substring(length);
            startingValue = previousNumber;
            if (willIncreaseLength(previousNumber, length)) {
                length++;
            }
            while (s.length() >= length) {
                long newNumber = Long.parseLong(s.substring(startSplit, length));
                if (newNumber - previousNumber == 1) {
                    s = s.substring(length);
                    previousNumber = newNumber;
                    if (willIncreaseLength(previousNumber, length))
                        length++;
                } else {
                    maintained = false;
                    break;
                }
            }
            if (s.length() >= 1)
                maintained = false;
            if (maintained) {
                break;
            }
        }

        if (maintained)
            System.out.println(YES + " " + startingValue);
        else
            System.out.println(NO);
    }

    Map<Integer, Long> valMap = new HashMap<>();

    boolean willIncreaseLength(long value, int length) {
        if (!valMap.containsKey(length)) {
            StringBuilder builder = new StringBuilder();
            for (int i = 0; i < length; i++)
                builder.append(9);
            valMap.put(length, Long.parseLong(builder.toString()));
        }
        return valMap.get(length) == value;
    }

    boolean isSameChar(String s) {
        char firstChar = s.charAt(0);
        for (int i = 1; i < s.length(); i++) {
            if (firstChar != s.charAt(i))
                return false;
        }
        return true;
    }
}
