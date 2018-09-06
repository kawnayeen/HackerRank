package algorithm.implementation;

import java.util.Arrays;

public class _15_MagicSquare {

    private static int[][][] magicSquares = {
            {
                    {8, 1, 6},
                    {3, 5, 7},
                    {4, 9, 2}
            },
            {
                    {6, 1, 8},
                    {7, 5, 3},
                    {2, 9, 4}
            },
            {
                    {4, 9, 2},
                    {3, 5, 7},
                    {8, 1, 6}
            },
            {
                    {2, 9, 4},
                    {7, 5, 3},
                    {6, 1, 8}
            },
            {
                    {8, 3, 4},
                    {1, 5, 9},
                    {6, 7, 2}
            },
            {
                    {4, 3, 8},
                    {9, 5, 1},
                    {2, 7, 6}
            },
            {
                    {6, 7, 2},
                    {1, 5, 9},
                    {8, 3, 4}
            },
            {
                    {2, 7, 6},
                    {9, 5, 1},
                    {4, 3, 8}
            }
    };

    int formingMagicSquare(int[][] s) {
        int[] diff = {0, 0, 0, 0, 0, 0, 0, 0};
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 8; k++) {
                    diff[k] += Math.abs(s[i][j] - magicSquares[k][i][j]);
                }
            }
        }
        return Arrays.stream(diff).min().orElse(0);
    }
}
