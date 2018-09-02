package datastructure.array;

public class _2_HourGlass {
    private boolean[][] hourGlassTemplate = {
            {true, true, true},
            {false, true, false},
            {true, true, true}
    };

    public int getMaximumHourGlass(int[][] arr) {
        int numberOfRows = arr.length;
        int numberOfColumns = arr[0].length;
        if(numberOfRows<3 || numberOfColumns<3)
            return 0;
        int maxHourGlassSum = -1000;
        for (int i = 0; (i + 2) < numberOfRows; i++) {
            for (int j = 0; (j + 2) < numberOfColumns; j++) {
                int sum = getSumOfHourGlassAt(arr, i, j);
                if (sum > maxHourGlassSum)
                    maxHourGlassSum = sum;
            }
        }
        return maxHourGlassSum;
    }

    private int getSumOfHourGlassAt(int[][] arr, int startingRow, int startingColumn) {
        int sum = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (hourGlassTemplate[i][j]) {
                    sum += arr[startingRow + i][startingColumn + j];
                }
            }
        }
        return sum;
    }
}
