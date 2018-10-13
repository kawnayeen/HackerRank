package algorithm.sorting;

import util.FrequencyCount;

import java.util.*;
import java.util.stream.Collectors;

/**
 * kawnayeen
 * 10/10/18
 */
public class _1_BigSorting {
    String[] bigSorting(String[] unsorted) {
        Map<String, Integer> strCount = FrequencyCount.countStringFrequency(unsorted);
        List<String> keys = strCount.keySet().parallelStream()
                .sorted(_1_BigSorting::compare).collect(Collectors.toList());
        int index = 0;
        for (String key : keys) {
            int count = strCount.get(key);
            while (count != 0) {
                unsorted[index] = key;
                index++;
                count--;
            }
        }
        return unsorted;
    }

    static int compare(String firstStr, String secondStr) {
        if (firstStr.length() != secondStr.length())
            return firstStr.length() - secondStr.length();
        return firstStr.compareTo(secondStr);
    }
}
