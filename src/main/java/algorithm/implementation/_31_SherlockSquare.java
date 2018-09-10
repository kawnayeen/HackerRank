package algorithm.implementation;

/**
 * kawnayeen
 * 10/9/18
 */
public class _31_SherlockSquare {
    int squares(int a, int b) {
        int startingValue = (int) Math.ceil(Math.sqrt(a));
        int endingValue = (int) Math.floor(Math.sqrt(b));
        return endingValue - startingValue + 1;
    }
}
