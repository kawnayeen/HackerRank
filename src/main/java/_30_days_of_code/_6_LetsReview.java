package _30_days_of_code;

import java.util.stream.IntStream;

/**
 * kawnayeen
 * 29/8/18
 */
public class _6_LetsReview {
    public String splitIntoOddAndEven(String input) {
        StringBuilder evenString = new StringBuilder();
        StringBuilder oddString = new StringBuilder();
        IntStream.range(0, input.length())
                .filter(i -> i % 2 == 0)
                .forEach(i -> evenString.append(input.charAt(i)));
        IntStream.range(0, input.length())
                .filter(i -> i % 2 == 1)
                .forEach(i -> oddString.append(input.charAt(i)));
        return evenString.toString() + " " + oddString.toString();
    }
}
