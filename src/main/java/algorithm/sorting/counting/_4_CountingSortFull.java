package algorithm.sorting.counting;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class _4_CountingSortFull {
    void countSort(List<List<String>> arr) {
        int numberOfElement = arr.size();
        int numberOfDashReplacement = numberOfElement / 2;
        Map<Integer, List<String>> sortedMap = new HashMap<>();
        int i = 0;
        for (; i < numberOfDashReplacement; i++) {
            int index = Integer.parseInt(arr.get(i).get(0));
            if (!sortedMap.containsKey(index))
                sortedMap.put(index, new ArrayList<>());
            sortedMap.get(index).add("-");
        }
        for (; i < numberOfElement; i++) {
            int index = Integer.parseInt(arr.get(i).get(0));
            if (!sortedMap.containsKey(index))
                sortedMap.put(index, new ArrayList<>());
            sortedMap.get(index).add(arr.get(i).get(1));
        }

        StringBuilder builder = new StringBuilder();
        for (int k = 0; k <= 100; k++) {
            if (sortedMap.containsKey(k)) {
                List<String> strings = sortedMap.get(k);
                for (String str : strings) {
                    builder.append(str);
                    builder.append(" ");
                }
            }
        }
        System.out.println(builder.toString().trim());
    }
}
