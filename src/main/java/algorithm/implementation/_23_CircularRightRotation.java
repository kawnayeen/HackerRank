package algorithm.implementation;

public class _23_CircularRightRotation {
    int[] circularArrayRotation(int[] a, int k, int[] queries) {
        int arraySize = a.length;
        k = k % arraySize;
        int[] tempStorage = new int[k];
        System.arraycopy(a, arraySize - k, tempStorage, 0, k);
        System.arraycopy(a, 0, a, k, arraySize - k);
        System.arraycopy(tempStorage, 0, a, 0, k);
        int[] output = new int[queries.length];
        for(int i=0;i<queries.length;i++)
            output[i] = a[queries[i]];
        return output;
    }
}
