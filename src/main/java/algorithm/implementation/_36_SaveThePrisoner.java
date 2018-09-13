package algorithm.implementation;

/**
 * kawnayeen
 * 13/9/18
 */
public class _36_SaveThePrisoner {
    int saveThePrisoner(int n, int m, int s) {
        if (n == 1)
            return n;
        // n sweet will cover from s to prior position of s
        // m%n will just give us the remaining - no need to consider the full rotation
        // as end at prior position, that's why -1
        int calculatedPosition = (s + ((m % n) == 0 ? n : m % n) - 1);
        return (calculatedPosition % n == 0) ? calculatedPosition : calculatedPosition % n;
    }
}
