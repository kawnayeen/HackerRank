package algorithm.implementation;

public class _52_ManasaAndStones {

    int[] stones(int n, int a, int b) {
        if (a == b) {
            int[] temp = new int[1];
            temp[0] = b * (n - 1);
            return temp;
        }
        int[] output = new int[n];
        output[n - 1] = Math.max(a, b) * (n - 1);
        int difference = Math.abs(b - a);
        for (int i = n - 2; i >= 0; i--)
            output[i] = output[i + 1] - difference;
        return output;
    }
}
