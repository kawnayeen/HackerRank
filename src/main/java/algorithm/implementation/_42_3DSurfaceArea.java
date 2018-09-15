package algorithm.implementation;

public class _42_3DSurfaceArea {
    int row;
    int column;

    int surfaceArea(int[][] A) {

        int surface = 0;
        row = A.length;
        column = A[0].length;
        if (row == 1 && column == 1)
            return (A[0][0] * 4 + 2);
        surface += (2 * row * column);
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if (isSpecialCorner(i, j))
                    surface += (A[i][j] * 3);
                else if (isCorner(i, j))
                    surface += (A[i][j] * 2);
                else if (i == 0 || i == row - 1)
                    surface += A[i][j];
                else if (j == 0 || j == column - 1)
                    surface += A[i][j];
                if (i < row - 1) {
                    surface += (int) Math.abs(A[i + 1][j] - A[i][j]);
                }
                if (j < column - 1) {
                    surface += (int) Math.abs(A[i][j + 1] - A[i][j]);
                }
            }
        }
        return surface;
    }

    private boolean isCorner(int i, int j) {
        if (row ==1 || column == 1)
            return true;
        if ((i == 0 && j == 0) || (i == row - 1 && j == 0) || (i == 0 && j == column - 1) || (i == row - 1 && j == column - 1)) {
            return true;
        }
        return false;
    }

    private boolean isSpecialCorner(int i, int j) {
        if (row > 1 && column > 1)
            return false;
        if (row == 1) {
            if (j == 0 || j == column - 1)
                return true;
        }

        if (column == 1) {
            if (i == 0 || i == row - 1)
                return true;
        }
        return false;
    }
}
