package algorithm.implementation;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _24_CutTheSticks {
    int[] cutTheSticks(int[] arr) {
        List<Integer> cutList = new ArrayList<>();
        while (arr.length > 0) {
            cutList.add(arr.length);
            int minValue = Arrays.stream(arr).min().orElse(-1);
            if (minValue == -1)
                break;

            arr = Arrays.stream(arr).filter(i -> i > minValue).toArray();
        }
        return cutList.stream().mapToInt(Integer::intValue).toArray();
    }
}
