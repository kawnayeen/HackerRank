package algorithm.sorting.quick;

import java.util.Arrays;
import java.util.stream.IntStream;


public class _1_Partition {
    int[] quickSort(int[] arr) {
        int[] left = Arrays.stream(arr).filter(v -> v < arr[0]).toArray();
        int[] equal = Arrays.stream(arr).filter(v -> v == arr[0]).toArray();
        int[] right = Arrays.stream(arr).filter(v -> v > arr[0]).toArray();
        return IntStream.concat(Arrays.stream(left),
                IntStream.concat(Arrays.stream(equal), Arrays.stream(right))
                ).toArray();
    }
}
