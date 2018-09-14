package algorithm.implementation;

import java.util.HashMap;
import java.util.Map;

public class _39_TimeInWords {
    private static final Map<Integer, String> intToWord = new HashMap<>();
    private static final String O_CLOCK = "o' clock";
    private static final String MINUTE = "minute";
    private static final String MINUTES = "minutes";
    private static final String PAST = "past";
    private static final String TO = "to";

    String timeInWords(int h, int m) {
        constructIntToWord();
        if (m == 0)
            return intToWord.get(h) + " " + O_CLOCK;
        if (m <= 30)
            return convertMinuteToWord(m) + " " + PAST + " " + intToWord.get(h);
        m = 60 - m;
        return convertMinuteToWord(m) + " " + TO + " " + intToWord.get((h + 1) % 12);
    }

    private String convertMinuteToWord(int minute) {
        if (minute == 1)
            return intToWord.get(minute) + " " + MINUTE;
        if (minute == 15 || minute == 30)
            return intToWord.get(minute);
        return intToWord.get(minute) + " " + MINUTES;
    }

    private void constructIntToWord() {
        intToWord.put(1, "one");
        intToWord.put(2, "two");
        intToWord.put(3, "three");
        intToWord.put(4, "four");
        intToWord.put(5, "five");
        intToWord.put(6, "six");
        intToWord.put(7, "seven");
        intToWord.put(8, "eight");
        intToWord.put(9, "nine");
        intToWord.put(10, "ten");
        intToWord.put(11, "eleven");
        intToWord.put(12, "twelve");
        intToWord.put(13, "thirteen");
        intToWord.put(14, "fourteen");
        intToWord.put(15, "quarter");
        intToWord.put(16, "sixteen");
        intToWord.put(17, "seventeen");
        intToWord.put(18, "eighteen");
        intToWord.put(19, "nineteen");
        intToWord.put(20, "twenty");
        intToWord.put(21, "twenty one");
        intToWord.put(22, "twenty two");
        intToWord.put(23, "twenty three");
        intToWord.put(24, "twenty four");
        intToWord.put(25, "twenty five");
        intToWord.put(26, "twenty six");
        intToWord.put(27, "twenty seven");
        intToWord.put(28, "twenty eight");
        intToWord.put(29, "twenty nine");
        intToWord.put(30, "half");
    }
}
