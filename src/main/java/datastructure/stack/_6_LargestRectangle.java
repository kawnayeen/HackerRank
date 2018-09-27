package datastructure.stack;

public class _6_LargestRectangle {
    long largestRectangle(int[] h) {
        int maxArea = 0;
        for (int i = 0; i < h.length - 1; i++) {
            int minValue = h[i];
            if ((minValue * h.length) > maxArea) {
                for (int j = i + 1; j < h.length; j++) {
                    if (h[j] < minValue) {
                        minValue = h[j];
                    }
                    int areaOfCurrentSelection = minValue * (j - i + 1);
                    if (areaOfCurrentSelection > maxArea)
                        maxArea = areaOfCurrentSelection;
                }
            }
        }
        return maxArea;
    }
}
