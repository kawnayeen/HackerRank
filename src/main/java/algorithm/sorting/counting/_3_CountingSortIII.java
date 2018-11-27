package algorithm.sorting.counting;

import java.util.Arrays;
import java.util.Scanner;

public class _3_CountingSortIII {

    private int[] getEqualOrBelowCount(int[] values) {
        int[] output = new int[100];
        int maxValue = Arrays.stream(values).max().orElse(values[0]);
        int[] frequency = new int[maxValue + 1];
        for (int val : values) {
            frequency[val] = frequency[val] + 1;
        }
        output[0] = frequency[0];
        for (int i = 1; i < 100; i++) {
            if (i < frequency.length)
                output[i] = output[i - 1] + frequency[i];
            else
                output[i] = output[i - 1];
        }
        return output;
    }

    private void takeInput() {
        Scanner scanner = new Scanner(System.in);
        int numberOfInput = scanner.nextInt();
        scanner.nextLine();
        int[] inputArray = new int[numberOfInput];
        for (int i = 0; i < numberOfInput; i++) {
            inputArray[i] = scanner.nextInt();
            scanner.nextLine();
        }
    }
}
