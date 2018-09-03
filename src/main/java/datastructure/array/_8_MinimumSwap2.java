package datastructure.array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class _8_MinimumSwap2 {
    private class Info {
        int initialIndex;
        int sortedIndex;
        boolean isVisited;
    }

    public int minimumSwap(int[] arr) {
        Map<Integer, Info> infoMap = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int val = arr[i];
            Info info = new Info();
            info.initialIndex = i;
            info.isVisited = false;
            infoMap.put(val, info);
        }
        int[] actualInput = new int[arr.length];
        System.arraycopy(arr, 0, actualInput, 0, arr.length);
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            int val = arr[i];
            infoMap.get(val).sortedIndex = i;
        }
        int swap = 0;
        for (int i = 0; i < arr.length; i++) {
            int val = arr[i];
            Info info = infoMap.get(val);
            if (info.isVisited || info.initialIndex == i)
                continue;
            int cycleLength = 0;
            Info occupierInfo = infoMap.get(actualInput[i]);
            while (!occupierInfo.isVisited) {
                cycleLength++;
                occupierInfo.isVisited = true;
                occupierInfo = infoMap.get(actualInput[occupierInfo.sortedIndex]);
            }
            swap += (cycleLength - 1);
        }
        return swap;
    }
}
