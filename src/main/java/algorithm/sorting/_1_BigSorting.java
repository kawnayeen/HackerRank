package algorithm.sorting;

import java.util.Arrays;

/**
 * kawnayeen
 * 10/10/18
 */
public class _1_BigSorting {
    String[] bigSorting(String[] unsorted) {
        Arrays.sort(unsorted, (firstStr, secondStr) -> {
            if (firstStr.length() != secondStr.length())
                return firstStr.length() - secondStr.length();
            return firstStr.compareTo(secondStr);
        });
        return unsorted;
    }
}
