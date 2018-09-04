package algorithm.warmup;

public class _7_MinMaxSum {
    public String miniMaxSum(int[] arr) {
        int minValue = Integer.MAX_VALUE;
        int maxValue = Integer.MIN_VALUE;
        long sum = 0;
        for (int val : arr) {
            sum += val;
            if (val > maxValue)
                maxValue = val;
            if (val < minValue)
                minValue = val;
        }
        return (sum - maxValue) + " " + (sum - minValue);
    }
}
