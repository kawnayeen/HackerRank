package algorithm.warmup;

/**
 * kawnayeen
 * 4/9/18
 */
public class _5_PlusMinus {
    void plusMinus(int[] arr) {
        int numberOfPositiveValue = 0;
        int numberOfZero = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0)
                numberOfZero++;
            else if (arr[i] > 0)
                numberOfPositiveValue++;
        }
        double positiveFraction = (numberOfPositiveValue * 1f) / arr.length;
        double zeroFraction = (numberOfZero * 1f) / arr.length;
        double negativeFraction = ((arr.length - numberOfPositiveValue - numberOfZero) * 1f) / arr.length;
        System.out.println(positiveFraction);
        System.out.println(negativeFraction);
        System.out.println(zeroFraction);
    }
}
