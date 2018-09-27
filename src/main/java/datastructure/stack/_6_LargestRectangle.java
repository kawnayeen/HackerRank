package datastructure.stack;

public class _6_LargestRectangle {
    long largestRectangle(int[] h) {
        int maxArea = 0;
        for (int i = 0; i < h.length; i++) {
            int curArea = 0;
            int count = 1;
            for (int j = i - 1; j >= 0; j--) {
                if (h[j] >= h[i]) {
                    count++;
                } else
                    break;
            }
            for (int j = i + 1; j < h.length; j++) {
                if (h[j] >= h[i]) {
                    count++;
                } else
                    break;
            }
            curArea = h[i] * count;
            if (maxArea < curArea) {
                maxArea = curArea;
            }
        }
        return maxArea;
    }
}
