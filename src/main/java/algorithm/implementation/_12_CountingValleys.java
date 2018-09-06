package algorithm.implementation;

/**
 * kawnayeen
 * 6/9/18
 */
public class _12_CountingValleys {
    int countingValleys(int n, String s) {
        int currentHeight = 0;
        int seaHeight = 0;
        int numberOfValley = 0;
        for (char c : s.toCharArray()) {
            if (c == 'U') {
                currentHeight++;
                if (currentHeight == seaHeight)
                    numberOfValley++;
            } else if (c == 'D') {
                currentHeight--;
            }
        }
        return numberOfValley;
    }
}
