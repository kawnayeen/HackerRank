package datastructure.array;

import java.util.stream.IntStream;

public class ReverseArray {
    public int[] reverse(int[] arr) {
        return IntStream.rangeClosed(1, arr.length).map(i -> arr[arr.length - i]).toArray();
    }
}
