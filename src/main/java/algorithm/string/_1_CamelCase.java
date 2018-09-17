package algorithm.string;

import java.util.stream.IntStream;

/**
 * kawnayeen
 * 17/9/18
 */
public class _1_CamelCase {
    int camelcase(String s) {
        return 1 + IntStream
                .range(0, s.length())
                .filter(i -> s.charAt(i) >= 'A' && s.charAt(i) <= 'Z')
                .toArray().length;
    }
}
