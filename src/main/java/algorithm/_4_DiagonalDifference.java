package algorithm;

/**
 * kawnayeen
 * 4/9/18
 */
public class _4_DiagonalDifference {
    int diagonalDifference(int[][] arr) {
        int sumOfPrimaryDiagonal = 0;
        int sumOfSecondaryDiagonal = 0;
        int arraySize = arr.length;
        for (int i = 0; i < arraySize; i++) {
            sumOfPrimaryDiagonal += arr[i][i];
            sumOfSecondaryDiagonal += arr[i][arraySize - 1 - i];
        }
        return Math.abs(sumOfPrimaryDiagonal - sumOfSecondaryDiagonal);
    }
}
