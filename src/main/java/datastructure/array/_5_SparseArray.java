package datastructure.array;

import java.util.HashMap;
import java.util.Map;

/**
 * kawnayeen
 * 3/9/18
 */
public class _5_SparseArray {
    int[] matchingStrings(String[] strings, String[] queries) {
        Map<String, Integer> frequencyMap = new HashMap<>();
        for (String str : strings) {
            if (frequencyMap.containsKey(str)) {
                int existingOccurrence = frequencyMap.get(str);
                existingOccurrence++;
                frequencyMap.put(str, existingOccurrence);
            } else {
                frequencyMap.put(str, 1);
            }
        }
        int[] occurrence = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            if (frequencyMap.containsKey(queries[i]))
                occurrence[i] = frequencyMap.get(queries[i]);
            else
                occurrence[i] = 0;
        }
        return occurrence;
    }
}
