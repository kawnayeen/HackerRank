package algorithm.implementation;

public class _2_AppleAndOrange {
    void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {
        int appleCount = 0;
        int orangeCount = 0;
        for (int val : apples) {
            if (withInRange(s, t, (a + val)))
                appleCount++;
        }
        for (int val : oranges) {
            if (withInRange(s, t, (b + val)))
                orangeCount++;
        }
        System.out.println(appleCount);
        System.out.println(orangeCount);
    }

    boolean withInRange(int start, int end, int val) {
        return val >= start && val <= end;
    }
}
